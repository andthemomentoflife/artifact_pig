"""Diagnostic functions, mainly for use when doing tech support."""
import cProfile
from StringIO import StringIO
from HTMLParser import HTMLParser
import bs4
from bs4 import BeautifulSoup, __version__
from bs4.builder import builder_registry

import os
import pstats
import random
import tempfile
import time
import traceback
import sys
import cProfile

def diagnose(data):
    """Diagnostic suite for isolating common problems."""
    # print "Diagnostic running on Beautiful Soup %s" % __version__
    # print "Python version %s" % sys.version

    basic_parsers = ["html.parser", "html5lib", "lxml"]
    for name in basic_parsers:
        for builder in builder_registry.builders:
            if name in builder.features:
                break
        else:
            basic_parsers.remove(name)
            print (
                "I noticed that %s is not installed. Installing it may help." %
                name)

    if 'lxml' in basic_parsers:
        basic_parsers.append(["lxml", "xml"])
        from lxml import etree
        # print "Found lxml version %s" % ".".join(map(str,etree.LXML_VERSION))

    if 'html5lib' in basic_parsers:
        import html5lib
        # print "Found html5lib version %s" % html5lib.__version__

    if hasattr(data, 'read'):
        data = data.read()
    elif os.path.exists(data):
        # print '"%s" looks like a filename. Reading data from the file.' % data
        data = open(data).read()
    elif data.startswith("http:") or data.startswith("https:"):
        # print '"%s" looks like a URL. Beautiful Soup is not an HTTP client.' % data
        # print "You need to use some other library to get the document behind the URL, and feed that document to Beautiful Soup."
        return
    print

    for parser in basic_parsers:
        # print "Trying to parse your markup with %s" % parser
        success = False
        try:
            soup = BeautifulSoup(data, parser)
            success = True
        except Exception as e:
            # print "%s could not parse the markup." % parser
            traceback.print_exc()
        if success:
            # print "Here's what %s did with the markup:" % parser
            print (soup.prettify())

        # print "-" * 80

def lxml_trace(data, html=True, **kwargs):
    """Print out the lxml events that occur during parsing.

    This lets you see how lxml parses a document when no Beautiful
    Soup code is running.
    """
    from lxml import etree
    for event, element in etree.iterparse(StringIO(data), html=html, **kwargs):
        print("%s, %4s, %s" % (event, element.tag, element.text))

class AnnouncingParser(HTMLParser):
    """Announces HTMLParser parse events, without doing anything else."""

    def _p(self, s):
        print(s)

    def handle_starttag(self, name, attrs):
        self._p("%s START" % name)

    def handle_endtag(self, name):
        self._p("%s END" % name)

    def handle_data(self, data):
        self._p("%s DATA" % data)

    def handle_charref(self, name):
        self._p("%s CHARREF" % name)

    def handle_entityref(self, name):
        self._p("%s ENTITYREF" % name)

    def handle_comment(self, data):
        self._p("%s COMMENT" % data)

    def handle_decl(self, data):
        self._p("%s DECL" % data)

    def unknown_decl(self, data):
        self._p("%s UNKNOWN-DECL" % data)

    def handle_pi(self, data):
        self._p("%s PI" % data)

def htmlparser_trace(data):
    """Print out the HTMLParser events that occur during parsing.

    This lets you see how HTMLParser parses a document when no
    Beautiful Soup code is running.
    """
    parser = AnnouncingParser()
    parser.feed(data)

_vowels = "aeiou"
_consonants = "bcdfghjklmnpqrstvwxyz"

def rword(length=5):
    "Generate a random word-like string."
    s = ''
    for i in range(length):
        if i % 2 == 0:
            t = _consonants
        else:
            t = _vowels
        s += random.choice(t)
    return s

def rsentence(length=4):
    "Generate a random sentence-like string."
    return " ".join(rword(random.randint(4,9)) for i in range(length))
        
def rdoc(num_elements=1000):
    """Randomly generate an invalid HTML document."""
    tag_names = ['p', 'div', 'span', 'i', 'b', 'script', 'table']
    elements = []
    for i in range(num_elements):
        choice = random.randint(0,3)
        if choice == 0:
            # New tag.
            tag_name = random.choice(tag_names)
            elements.append("<%s>" % tag_name)
        elif choice == 1:
            elements.append(rsentence(random.randint(1,4)))
        elif choice == 2:
            # Close a tag.
            tag_name = random.choice(tag_names)
            elements.append("</%s>" % tag_name)
    return "<html>" + "\n".join(elements) + "</html>"

def benchmark_parsers(num_elements=100000):
    """Very basic head-to-head performance benchmark."""
    # print "Comparative parser benchmark on Beautiful Soup %s" % __version__
    data = rdoc(num_elements)
    # print "Generated a large invalid HTML document (%d bytes)." % len(data)
    
    for parser in ["lxml", ["lxml", "html"], "html5lib", "html.parser"]:
        success = False
        try:
            a = time.time()
            soup = BeautifulSoup(data, parser)
            b = time.time()
            success = True
        except Exception as e:
            # print "%s could not parse the markup." % parser
            traceback.print_exc()
        if success:
            print( "BS4+%s parsed the markup in %.2fs." % (parser, b-a))

    from lxml import etree
    a = time.time()
    etree.HTML(data)
    b = time.time()
    print( "Raw lxml parsed the markup in %.2fs." % (b-a))

    import html5lib
    parser = html5lib.HTMLParser()
    a = time.time()
    parser.parse(data)
    b = time.time()
    print( "Raw html5lib parsed the markup in %.2fs." % (b-a))

def profile(num_elements=100000, parser="lxml"):

    filehandle = tempfile.NamedTemporaryFile()
    filename = filehandle.name

    data = rdoc(num_elements)
    vars = dict(bs4=bs4, data=data, parser=parser)
    cProfile.runctx('bs4.BeautifulSoup(data, parser)' , vars, vars, filename)

    stats = pstats.Stats(filename)
    # stats.strip_dirs()
    stats.sort_stats("cumulative")
    stats.print_stats('_html5lib|bs4', 50)

if __name__ == '__main__':
    diagnose(sys.stdin.read())
