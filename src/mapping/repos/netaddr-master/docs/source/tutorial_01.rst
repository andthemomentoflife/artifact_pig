============================================
Tutorial 1: IP Addresses, Subnets and Ranges
============================================

First of all you need to pull the various netaddr classes and functions into your namespace.

.. note:: Do this for the purpose of this tutorial only. In your own code, you should be explicit about the classes, functions and constants you import to avoid name clashes.

>>> from netaddr import *

We also import the standard library module `pprint` to help format our output.

>>> import pprint

----------------
Basic operations
----------------

The following `IPAddress` object represents a single IP address.

>>> ip = IPAddress('192.0.2.1')
>>> ip.version
4

The `repr()` call returns a Python statement that can be used to reconstruct an equivalent IP address object state from scratch when run in the Python interpreter.

>>> repr(ip)
"IPAddress('192.0.2.1')"
>>> ip
IPAddress('192.0.2.1')

Access in the string context returns the IP object as a string value.

>>> str(ip)
'192.0.2.1'
>>> '%s' % ip
'192.0.2.1'
>>> ip.format()  # only really useful for IPv6 addresses.
'192.0.2.1'

------------------------
Numerical representation
------------------------

You can view an IP address in various other formats.

>>> int(ip) == 3221225985
True
>>> hex(ip)
'0xc0000201'
>>> ip.bin
'0b11000000000000000000001000000001'
>>> ip.bits()
'11000000.00000000.00000010.00000001'
>>> ip.words == (192, 0, 2, 1)
True

---------------------------------
Representing networks and subnets
---------------------------------

`IPNetwork` objects are used to represent subnets, networks or VLANs that accept CIDR prefixes and netmasks.

>>> ip = IPNetwork('192.0.2.1')
>>> ip.ip
IPAddress('192.0.2.1')
>>> ip.network, ip.broadcast
(IPAddress('192.0.2.1'), None)
>>> ip.netmask, ip.hostmask
(IPAddress('255.255.255.255'), IPAddress('0.0.0.0'))
>>> ip.size
1

In this case, the network and broadcast address are the same, akin to a host route.

>>> ip = IPNetwork('192.0.2.0/24')
>>> ip.ip
IPAddress('192.0.2.0')
>>> ip.network, ip.broadcast
(IPAddress('192.0.2.0'), IPAddress('192.0.2.255'))
>>> ip.netmask, ip.hostmask
(IPAddress('255.255.255.0'), IPAddress('0.0.0.255'))
>>> ip.size
256

And finally, this IPNetwork object represents an IP address that belongs to a given IP subnet.

>>> ip = IPNetwork('192.0.3.112/22')
>>> ip.ip
IPAddress('192.0.3.112')
>>> ip.network, ip.broadcast
(IPAddress('192.0.0.0'), IPAddress('192.0.3.255'))
>>> ip.netmask, ip.hostmask
(IPAddress('255.255.252.0'), IPAddress('0.0.3.255'))
>>> ip.size
1024

Internally, each IPNetwork object only stores 3 values :

  * the IP address value as an unsigned integer
  * a reference to the IP protocol module for the IP version being represented
  * the CIDR prefix bitmask

All the other values are calculated on-the-fly on access.

It is possible to adjust the IP address value and the CIDR prefix after object instantiation.

>>> ip = IPNetwork('0.0.0.0/0')
>>> ip
IPNetwork('0.0.0.0/0')
>>> ip.value = 3221225985
>>> ip
IPNetwork('192.0.2.1/0')
>>> ip.prefixlen
0
>>> ip.prefixlen = 23
>>> ip
IPNetwork('192.0.2.1/23')

The prefix length can also be changed by specifying a subnet mask:

>>> ip = IPNetwork('192.168.1.0/24')
>>> ip.netmask = '255.255.0.0'
>>> ip
IPNetwork('192.168.1.0/16')
>>> ip = IPNetwork('fe80::dead:beef/64')
>>> ip.netmask = 'ffff:ffff::'
>>> ip
IPNetwork('fe80::dead:beef/32')

There is also a property that lets you access the *true* CIDR address which removes all host bits from the network address based on the CIDR subnet prefix.

>>> ip = IPNetwork('192.0.2.1/23')
>>> ip.cidr
IPNetwork('192.0.2.0/23')

This is handy for specifying some networking configurations correctly.

If you want to access information about each of the various IP addresses that form the IP subnet, this is available by performing pass through calls to sub methods of each `IPAddress` object.

For example if you want to see a binary digit representation of each address you can do the following.

>>> ip.ip.bits()
'11000000.00000000.00000010.00000001'
>>> ip.network.bits()
'11000000.00000000.00000010.00000000'
>>> ip.netmask.bits()
'11111111.11111111.11111110.00000000'
>>> ip.broadcast.bits()
'11000000.00000000.00000011.11111111'

------------
IPv6 support
------------

Full support for IPv6 is provided. Let's try a few examples:

>>> ip = IPAddress(0, 6)
>>> ip
IPAddress('::')
>>> ip = IPNetwork('fe80::dead:beef/64')
>>> str(ip), ip.prefixlen, ip.version
('fe80::dead:beef/64', 64, 6)
>>> int(ip.ip) == 338288524927261089654018896845083623151
True
>>> hex(ip.ip)
'0xfe8000000000000000000000deadbeef'

Bit-style output isn't as quite as friendly as hexadecimal for such a long numbers, but here the proof that it works!

>>> ip.ip.bits()
'1111111010000000:0000000000000000:0000000000000000:0000000000000000:0000000000000000:0000000000000000:1101111010101101:1011111011101111'

Here are some networking details for an IPv6 subnet.

>>> ip.network, ip.broadcast, ip.netmask, ip.hostmask
(IPAddress('fe80::'), IPAddress('fe80::ffff:ffff:ffff:ffff'), IPAddress('ffff:ffff:ffff:ffff::'), IPAddress('::ffff:ffff:ffff:ffff'))

--------------------------------------
Interoperability between IPv4 and IPv6
--------------------------------------

It is likely that with IPv6 becoming more prevalent, you'll want to be able to interoperate between IPv4 and IPv6 address seamlessly.

Here are a couple of methods that help achieve this.

^^^^^^^^^^^^^^^^^^^^^^^
IPv4 to IPv6 conversion
^^^^^^^^^^^^^^^^^^^^^^^

>>> IPAddress('192.0.2.15').ipv4()
IPAddress('192.0.2.15')
>>> ip = IPAddress('192.0.2.15').ipv6()
>>> ip
IPAddress('::ffff:192.0.2.15')
>>> ip.is_ipv4_mapped()
True
>>> ip.is_ipv4_compat()
False

>>> IPAddress('192.0.2.15').ipv6(ipv4_compatible=True)  # doctest: +SKIP
IPAddress('::192.0.2.15')
>>> IPAddress('192.0.2.15').ipv6(ipv4_compatible=True).is_ipv4_compat()
True
>>> IPAddress('192.0.2.15').ipv6(True)  # doctest: +SKIP
IPAddress('::192.0.2.15')
>>> ip = IPNetwork('192.0.2.1/23')
>>> ip.ipv4()
IPNetwork('192.0.2.1/23')
>>> ip.ipv6()
IPNetwork('::ffff:192.0.2.1/119')
>>> ip.ipv6(ipv4_compatible=True)  # doctest: +SKIP
IPNetwork('::192.0.2.1/119')

^^^^^^^^^^^^^^^^^^^^^^^
IPv6 to IPv4 conversion
^^^^^^^^^^^^^^^^^^^^^^^

>>> IPNetwork('::ffff:192.0.2.1/119').ipv6()
IPNetwork('::ffff:192.0.2.1/119')
>>> IPNetwork('::ffff:192.0.2.1/119').ipv6(ipv4_compatible=True)  # doctest: +SKIP
IPNetwork('::192.0.2.1/119')
>>> IPNetwork('::ffff:192.0.2.1/119').ipv4()
IPNetwork('192.0.2.1/23')
>>> IPNetwork('::192.0.2.1/119').ipv4()
IPNetwork('192.0.2.1/23')

Note that the IP object returns IPv4 "mapped" addresses by default in preference to IPv4 "compatible" ones. This has been chosen purposefully as the latter form has been deprecated (see RFC 4291 for details).

---------------
List operations
---------------

If you treat an `IPNetwork` object as if it were a standard Python list object it will give you access to a list of individual IP address objects. This of course is illusory and they are not created until you access them.

>>> ip = IPNetwork('192.0.2.16/29')

Accessing an IP object using the `list()` context invokes the default generator which returns a list of all IP objects in the range specified by the IP object's subnet.

>>> ip_list = list(ip)
>>> len(ip_list)
8
>>> ip_list
[IPAddress('192.0.2.16'), IPAddress('192.0.2.17'), ..., IPAddress('192.0.2.22'), IPAddress('192.0.2.23')]

The length of that list is 8 individual IP addresses.

>>> len(ip)
8

^^^^^^^^
Indexing
^^^^^^^^

You can use standard index access to IP addresses in the subnet.

>>> ip[0]
IPAddress('192.0.2.16')
>>> ip[1]
IPAddress('192.0.2.17')
>>> ip[-1]
IPAddress('192.0.2.23')

^^^^^^^
Slicing
^^^^^^^

You can also use list slices on IP addresses in the subnet.

>>> ip[0:4]
<generator object ...>

The slice is a generator function. This was done to save time and system resources as some slices can end up being very large for certain subnets!

Here is how you'd access all elements in a slice.

>>> list(ip[0:4])
[IPAddress('192.0.2.16'), IPAddress('192.0.2.17'), IPAddress('192.0.2.18'), IPAddress('192.0.2.19')]

Extended slicing is also supported.

>>> list(ip[0::2])
[IPAddress('192.0.2.16'), IPAddress('192.0.2.18'), IPAddress('192.0.2.20'), IPAddress('192.0.2.22')]

List reversal.

>>> list(ip[-1::-1])
[IPAddress('192.0.2.23'), IPAddress('192.0.2.22'), ..., IPAddress('192.0.2.17'), IPAddress('192.0.2.16')]

Use of generators ensures working with large IP subnets is efficient.

>>> for ip in IPNetwork('192.0.2.0/23'):
...    print('%s' % ip)
...
192.0.2.0
192.0.2.1
192.0.2.2
192.0.2.3
...
192.0.3.252
192.0.3.253
192.0.3.254
192.0.3.255

In IPv4 networks you only usually assign the addresses between the network and broadcast addresses to actual host interfaces on systems.

Here is the iterator provided for accessing these IP addresses :

>>> for ip in IPNetwork('192.0.2.0/23').iter_hosts():
...     print('%s' % ip)
...
192.0.2.1
192.0.2.2
192.0.2.3
192.0.2.4
...
192.0.3.251
192.0.3.252
192.0.3.253
192.0.3.254

---------------------------------
Sorting IP addresses and networks
---------------------------------

It is fairly common and useful to be able to sort IP addresses and networks canonically.

Here is how sorting works with individual addresses.

>>> import random
>>> ip_list = list(IPNetwork('192.0.2.128/28'))
>>> random.shuffle(ip_list)
>>> sorted(ip_list)
[IPAddress('192.0.2.128'), IPAddress('192.0.2.129'), ..., IPAddress('192.0.2.142'), IPAddress('192.0.2.143')]

For convenience, you are able to sort IP subnets at the same time as addresses and they can be combinations of IPv4 and IPv6 addresses at the same time as well (IPv4 addresses and network appear before IPv6 ones).

>>> ip_list = [
... IPAddress('192.0.2.130'),
... IPAddress('10.0.0.1'),
... IPNetwork('192.0.2.128/28'),
... IPNetwork('192.0.3.0/24'),
... IPNetwork('192.0.2.0/24'),
... IPNetwork('fe80::/64'),
... IPAddress('::')]
>>> random.shuffle(ip_list)
>>> ip_list.sort()
>>> pprint.pprint(ip_list)
[IPAddress('10.0.0.1'),
 IPNetwork('192.0.2.0/24'),
 IPNetwork('192.0.2.128/28'),
 IPAddress('192.0.2.130'),
 IPNetwork('192.0.3.0/24'),
 IPAddress('::'),
 IPNetwork('fe80::/64')]

Notice how overlapping subnets also sort in order from largest to smallest.

-----------------------------------------
Summarizing list of addresses and subnets
-----------------------------------------

Another useful operation is the ability to summarize groups of IP subnets and addresses, merging them together where possible to create the smallest possible list of CIDR subnets.

You do this in netaddr using the `cidr_merge()` function.

First we create a list of IP objects that contains a good mix of individual addresses and subnets, along with some string based IP address values for good measure. To make things more interesting some IPv6 addresses are thrown in as well.

>>> ip_list = [ip for ip in IPNetwork('fe80::/120')]
>>> ip_list.append(IPNetwork('192.0.2.0/24'))
>>> ip_list.extend([str(ip) for ip in IPNetwork('192.0.3.0/24')])
>>> ip_list.append(IPNetwork('192.0.4.0/25'))
>>> ip_list.append(IPNetwork('192.0.4.128/25'))
>>> len(ip_list)
515
>>> cidr_merge(ip_list)
[IPNetwork('192.0.2.0/23'), IPNetwork('192.0.4.0/24'), IPNetwork('fe80::/120')]

Useful isn't it?

---------------------
Supernets and subnets
---------------------

It is quite common to have a large CIDR subnet that you may want to split up into multiple smaller component blocks to better manage your network allocations, firewall rules etcc and netaddr gives you the tools required to do this.

Here we take a large /16 private class B network block and split it up into a set of smaller 512 sized blocks.

>>> ip = IPNetwork('172.24.0.0/16')
>>> ip.subnet(23)
<generator object ...>

Once again, this method produces and iterator because of the possibility for a large number of return values depending on this subnet size specified.

>>> subnets = list(ip.subnet(23))
>>> len(subnets)
128
>>> subnets
[IPNetwork('172.24.0.0/23'), IPNetwork('172.24.2.0/23'), IPNetwork('172.24.4.0/23'), ..., IPNetwork('172.24.250.0/23'), IPNetwork('172.24.252.0/23'), IPNetwork('172.24.254.0/23')]

It is also possible to retrieve the list of supernets that a given IP address or subnet belongs to. You can also specify an optional limit.

>>> ip = IPNetwork('192.0.2.114')
>>> supernets = ip.supernet(22)
>>> pprint.pprint(supernets)
[IPNetwork('192.0.0.0/22'),
 IPNetwork('192.0.2.0/23'),
 IPNetwork('192.0.2.0/24'),
 IPNetwork('192.0.2.0/25'),
 IPNetwork('192.0.2.64/26'),
 IPNetwork('192.0.2.96/27'),
 IPNetwork('192.0.2.112/28'),
 IPNetwork('192.0.2.112/29'),
 IPNetwork('192.0.2.112/30'),
 IPNetwork('192.0.2.114/31')]

Here, we return a list rather than a generator because the potential list of values is of a predictable size (no more than 31 subnets for an IPv4 address and 127 for IPv6).

---------------------------------------
Support for non-standard address ranges
---------------------------------------

While CIDR is a useful way to describe networks succinctly, it is often necessary (particularly with IPv4 which predates the CIDR specification) to be able to generate lists of IP addresses that have an arbitrary start and end address that do not fall on strict bit mask boundaries.

The `iter_iprange()` function allow you to do just this.

>>> ip_list = list(iter_iprange('192.0.2.1', '192.0.2.14'))
>>> len(ip_list)
14
>>> ip_list
[IPAddress('192.0.2.1'), IPAddress('192.0.2.2'), ..., IPAddress('192.0.2.13'), IPAddress('192.0.2.14')]

It is equally nice to know what the actual list of CIDR subnets is that would correctly cover this non-aligned range of addresses.

Here `cidr_merge()` comes to the rescue once more.

>>> cidr_merge(ip_list)
[IPNetwork('192.0.2.1/32'), IPNetwork('192.0.2.2/31'), IPNetwork('192.0.2.4/30'), IPNetwork('192.0.2.8/30'), IPNetwork('192.0.2.12/31'), IPNetwork('192.0.2.14/32')]

--------------------------------------------
Dealing with older IP network specifications
--------------------------------------------

Until the advent of the CIDR specification it was common to infer the netmask of an IPv4 address based on its first octet using an set of classful rules (first defined in RFC 791).

You frequently come across reference to them in various RFCs and they are well supported by a number of software libraries. For completeness, rather than leave out this important (but now somewhat historical) set of rules, they are supported via the cryptically named `cidr_abbrev_to_verbose()` function.

Here is an example of these rules for the whole of the IPv4 address space.

>>> cidrs = [cidr_abbrev_to_verbose(octet) for octet in range(0, 256)]
>>> pprint.pprint(cidrs)
['0.0.0.0/8',
...
 '127.0.0.0/8',
 '128.0.0.0/16',
...
 '191.0.0.0/16',
 '192.0.0.0/24',
...
 '223.0.0.0/24',
 '224.0.0.0/4',
...
 '239.0.0.0/4',
 '240.0.0.0/32',
...
 '255.0.0.0/32']
>>> len(cidrs)
256

-------------------------
IP address categorisation
-------------------------

IP addresses fall into several categories, not all of which are suitable for assignment as host addresses.

^^^^^^^
Unicast
^^^^^^^

>>> IPAddress('192.0.2.1').is_unicast()
True
>>> IPAddress('fe80::1').is_unicast()
True

^^^^^^^^^
Multicast
^^^^^^^^^

Used to identify multicast groups (see RFC 2365 and 3171 for more info).

>>> IPAddress('239.192.0.1').is_multicast()
True
>>> IPAddress('ff00::1').is_multicast()
True


^^^^^^^^
Reserved
^^^^^^^^

Addresses in reserved ranges are not available for general use.

>>> IPAddress('253.0.0.1').is_reserved()
True


^^^^^^^^
Netmasks
^^^^^^^^

A bitmask used to divide an IP address into its network address and host address.

>>> IPAddress('255.255.254.0').is_netmask()
True

^^^^^^^^^
Hostmasks
^^^^^^^^^

Similar to a netmask but with the all the bits flipped the opposite way.

>>> IPAddress('0.0.1.255').is_hostmask()
True

^^^^^^^^
Loopback
^^^^^^^^

These addresses are used internally within an IP network stack and packets sent to these addresses are not distributed via a physical network connection.

>>> IPAddress('127.0.0.1').is_loopback()
True
>>> IPAddress('::1').is_loopback()
True

----------------------
Comparing IP addresses
----------------------

`IPAddress` objects can be compared with each other. As an `IPAddress` object can represent both an individual IP address and an implicit network, it pays to get both sides of your comparison into the same terms before you compare them to avoid odd results.

Here are some comparisons of individual IP address to get the ball rolling.

>>> IPAddress('192.0.2.1') == IPAddress('192.0.2.1')
True
>>> IPAddress('192.0.2.1') < IPAddress('192.0.2.2')
True
>>> IPAddress('192.0.2.2') > IPAddress('192.0.2.1')
True
>>> IPAddress('192.0.2.1') != IPAddress('192.0.2.1')
False
>>> IPAddress('192.0.2.1') >= IPAddress('192.0.2.1')
True
>>> IPAddress('192.0.2.2') >= IPAddress('192.0.2.1')
True
>>> IPAddress('192.0.2.1') <= IPAddress('192.0.2.1')
True
>>> IPAddress('192.0.2.1') <= IPAddress('192.0.2.2')
True

Now, lets try something a little more interesting.

>>> IPNetwork('192.0.2.0/24') == IPNetwork('192.0.2.112/24')
True

Hmmmmmmmm... looks a bit odd doesn't it? That's because by default, IP objects compare their subnets (or lower and upper boundaries) rather than their individual IP address values.

The solution to this situation is very simple. Knowing this default behaviour, just be explicit about exactly which portion of each IP object you'd like to compare using pass-through properties.

>>> IPNetwork('192.0.2.0/24').ip == IPNetwork('192.0.2.112/24').ip
False
>>> IPNetwork('192.0.2.0/24').ip < IPNetwork('192.0.2.112/24').ip
True

That's more like it. You can also be explicit about comparing networks in this way if you so wish (although it is not strictly necessary).

>>> IPNetwork('192.0.2.0/24').cidr == IPNetwork('192.0.2.112/24').cidr
True

Armed with this information here are some examples of network comparisons.

>>> IPNetwork('192.0.2.0/24') == IPNetwork('192.0.3.0/24')
False
>>> IPNetwork('192.0.2.0/24') < IPNetwork('192.0.3.0/24')
True

This will inevitably raise questions about comparing IPAddress (scalar) objects and IPNetwork (vector) objects with each other (or at least it should).

Here is how netaddr chooses to address this situation.

>>> IPAddress('192.0.2.0') == IPNetwork('192.0.2.0/32')
False
>>> IPAddress('192.0.2.0') != IPNetwork('192.0.2.0/32')
True

An IP network or subnet is different from an individual IP address and therefore cannot be (directly) compared.

If you want to compare them successfully, you must be explicit about which aspect of the IP network you wish to match against the IP address in question.

You can use the index of the first or last address if it is a /32 like so :

>>> IPAddress('192.0.2.0') == IPNetwork('192.0.2.0/32')[0]
True
>>> IPAddress('192.0.2.0') == IPNetwork('192.0.2.0/32')[-1]
True
>>> IPAddress('192.0.2.0') != IPNetwork('192.0.2.0/32')[0]
False

You can also use the base address if this is what you wish to compare :

>>> IPAddress('192.0.2.0') == IPNetwork('192.0.2.0/32').ip
True
>>> IPAddress('192.0.2.0') != IPNetwork('192.0.2.0/32').ip
False

While this may seem a bit pointless at first, netaddr strives to keep IP addresses and network separate from one another while still allowing reasonable interoperability.

-----------
DNS support
-----------

It is a common administrative task to generate reverse IP lookups for DNS. This is particularly arduous for IPv6 addresses.

Here is how you do this using an IPAddress object's `reverse_dns()` method.

>>> IPAddress('172.24.0.13').reverse_dns
'13.0.24.172.in-addr.arpa.'
>>> IPAddress('fe80::feeb:daed').reverse_dns
'd.e.a.d.b.e.e.f.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.8.e.f.ip6.arpa.'

Note that ``ip6.int`` is not used as this has been deprecated (see RFC 3152 for details).

---------------------------
Non standard address ranges
---------------------------

As CIDR is a relative newcomer given the long history of IP version 4 you are quite likely to come across systems and documentation which make reference to IP address ranges in formats other than CIDR. Converting from these arbitrary range types to CIDR and back again isn't a particularly fun task. Fortunately, netaddr tries to make this job easy for you with two purpose built classes.

^^^^^^^^^^^^^^^^^^^^^^^^^^^
Arbitrary IP address ranges
^^^^^^^^^^^^^^^^^^^^^^^^^^^

You can represent an arbitrary IP address range using a lower and upper bound address in the form of an IPRange object.

>>> r1 = IPRange('192.0.2.1', '192.0.2.15')
>>> r1
IPRange('192.0.2.1', '192.0.2.15')

You can iterate across and index these ranges just like and IPNetwork object.

Importantly, you can also convert it to it's CIDR equivalent.

>>> r1.cidrs()
[IPNetwork('192.0.2.1/32'), IPNetwork('192.0.2.2/31'), IPNetwork('192.0.2.4/30'), IPNetwork('192.0.2.8/29')]

Here is how individual IPRange and IPNetwork compare.

>>> IPRange('192.0.2.0', '192.0.2.255') != IPNetwork('192.0.2.0/24')
False
>>> IPRange('192.0.2.0', '192.0.2.255') == IPNetwork('192.0.2.0/24')
True

You may wish to compare an IP range against a list of IPAddress and IPNetwork
objects.

>>> r1 = IPRange('192.0.2.1', '192.0.2.15')
>>> addrs = list(r1)
>>> addrs
[IPAddress('192.0.2.1'), IPAddress('192.0.2.2'), IPAddress('192.0.2.3'), IPAddress('192.0.2.4'), IPAddress('192.0.2.5'), IPAddress('192.0.2.6'), IPAddress('192.0.2.7'), IPAddress('192.0.2.8'), IPAddress('192.0.2.9'), IPAddress('192.0.2.10'), IPAddress('192.0.2.11'), IPAddress('192.0.2.12'), IPAddress('192.0.2.13'), IPAddress('192.0.2.14'), IPAddress('192.0.2.15')]
>>> r1 == addrs
False

Oops! Not quite what we were looking for or expecting.

The way to do this is to get either side of the comparison operation into the same terms.

>>> list(r1) == addrs
True

That's more like it.

The same goes for IPNetwork objects.

>>> subnets = r1.cidrs()
>>> subnets
[IPNetwork('192.0.2.1/32'), IPNetwork('192.0.2.2/31'), IPNetwork('192.0.2.4/30'), IPNetwork('192.0.2.8/29')]
>>> r1 == subnets
False
>>> r1.cidrs() == subnets
True

The above works if the list you are comparing contains one type or the other, but what if you have a mixed list of `IPAddress`, `IPNetwork` and string addresses?

Time for some slightly more powerful operations. Let's make use of a new class for dealing with groups of IP addresses and subnets. The IPSet class.

>>> ips = [IPAddress('192.0.2.1'), '192.0.2.2/31', IPNetwork('192.0.2.4/31'), IPAddress('192.0.2.6'), IPAddress('192.0.2.7'), '192.0.2.8', '192.0.2.9', IPAddress('192.0.2.10'), IPAddress('192.0.2.11'), IPNetwork('192.0.2.12/30')]
>>> s1 = IPSet(r1.cidrs())
>>> s2 = IPSet(ips)
>>> s2
IPSet(['192.0.2.1/32', '192.0.2.2/31', '192.0.2.4/30', '192.0.2.8/29'])
>>> s1 == s2
True

Let's remove one of the element from one of the IPSet objects and see what happens.

>>> s2.pop()  # doctest: +ELLIPSIS
IPNetwork('...')
>>> s1 == s2
False

This is perhaps a somewhat contrived example but it just shows you some of the capabilities on offer.

See the IPSet tutorial :doc:`tutorial_03` for more details on that class.

^^^^^^^^^^^^^^
IP Glob ranges
^^^^^^^^^^^^^^

netaddr also supports a user friendly form of specifying IP address ranges using a "glob" style syntax.

.. note:: At present only IPv4 globs are supported.

>>> IPGlob('192.0.2.*') == IPNetwork('192.0.2.0/24')
True

>>> IPGlob('192.0.2.*') != IPNetwork('192.0.2.0/24')
False

As `IPGlob` is a subclass of `IPRange`, all of the same operations apply.
