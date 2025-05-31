Encoding
########

The LDAP RFCs states that strings sent and received by the LDAP server must be encoded with the **utf-8** encoding. Data in ldap3 flow from different sources to different tergets,
so they can have different encodings. There are 6 different flows in the ldap3 library:

* data coming from the server
* data going to the server
* data coming from the user
* data going to the user
* data going to output logs
* data coming from flaky servers that return the DN or the schema in not utf-8 encoding.

Server data flow
----------------

The LDAP protocol stores strings in a **Directory String** type that should always be in **utf-8** and it's stored in the
``DEFAULT_SERVER_ENCODING`` config parameter. For flaky server this encoding can be changed with::

    >>> from ldap3 import set_config_parameter
    >>> set_config_parameter('DEFAULT_SERVER_ENCODING', 'latin-1')

``DEFAULT_SERVER_ENCODING`` can be changed multiple times as needed. To know the current setting you can use the following code::

    >>> from ldap3 import get_config_parameter
    >>> get_config_parameter('DEFAULT_SERVER_ENCODING')
    'utf-8'


Some servers don't completely follow the LDAP RFCs and send data in a different encoding or in a mix of encodings. For example Active Directory
can send the DN of entries found in a search in a different encoding than utf-8. In this case you can use the ``ADDITIONAL_SERVER_ENCODINGS``
config parameter to decode the DN of the Search operation response. It can be set to one encoding or a list of encodings. If
a list of encodings is provided ldap3 tries sequentially each encoding until a valid decode is performed. If any of the specified
encodings is able to decode the value then an ``UnicodeError`` exception is raised.

``ADDITIONAL_SERVER_ENCODINGS`` defaults to ``['latin1, 'koi8-r']`` for european and russian encodings

User data flow
--------------
ldap3 can receive data from the user in 4 different ways:

- data input during a program execution
- data stored in the source files
- data typed at the Python interpreter (the usual >>>)
- data input from another program via stdin

When dealing with user input the encoding can be (and probably is) different from utf-8, so ldap3 tries to guess what encoding is used and store it in the
``DEFAULT_CLIENT_ENCODING`` parameter. ldap3 uses the **stdin.encoding** if present, else the sys.getdefaultencoding() and if neither is present sets
``DEFAULT_CLIENT_ENCODING`` to ``utf-8``.

You can set a specific ``DEFAULT_CLIENT_ENCODING`` with the following code::

    >>> from ldap3 import set_config_parameter
    >>> set_config_parameter('DEFAULT_CLIENT_ENCODING', 'my_encoding')

``DEFAULT_CLIENT_ENCODING`` can be changed multiple times as needed. To know the current setting you can use the following code::

    >>> from ldap3 import get_config_parameter
    >>> get_config_parameter('DEFAULT_CLIENT_ENCODING')
    'utf-8'

This parameter is used when the ``auto_encode`` and ``auto_escape`` parameters of the Connection object are set to ``True``.

ldap3 can send data from the user in 3 different ways:

- data printed at the stdout
- data printed at the console
- data printed in the log files

Data printed at stdout and at the console (for example representation of ldap3 Server and Connection objects) are encoded with **stdout.encoding** if present,
else the ``ascii`` encoding is used. If ldap3 is unable to properly represents the data with the selected encoding then it uses a hexadecimal
representation of the byte value of the data. This ensure that there are no error and no missing data at the REPL or console level. This can lead to some differences
in output between Python 3 and Python 2.

Log file data flow
------------------

Data printed in the log files are always encoded in ``ascii`` with a ``backslashreplace`` failback in case of unprintable ascii values. This should assure that the log
is written without any decoding error.

Raw data in search response
---------------------------

You can always access the raw byte values of attributes returned in a search accessing the ``raw_attributes`` key of a response entry or the ``raw_values``
property of an Entry object in the Abstraction Layer.

