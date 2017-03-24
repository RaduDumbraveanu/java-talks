The cititizens
--------------

### Empty string
**Empty string** is the unique string of length zero, i.e. `""`.

### Blank string
Any string consisting only of white spaces is consideret **blank**.

1. `" "`
2. `"       \n"`

Other strings = 

Operations
----------

### Construction

1. by constructor

    String emptyStr = new String();
    String foo = new String("foo");
    String bar = new String("bar");

2. by string literals

    String emptyStr = "";
    String foo = "foo";
    String bar = "bar";

The compiler/jvm will create the object for you, but there is an excpetion. String has a private poll of string objects and when using literals it checks if such an object already exists it will use it.

Method `intern`

See : http://www.journaldev.com/797/what-is-java-string-pool

This is why:

    String foo = "foo";
    String bar = "foo";
    String foobar = new String("foo");
    
    foo == bar
    foo == foobar


from an array of bytes
from an array of chars
from string literal
from a stringbuffer/stringbuilder

### Concatenation

by `+`

#### Joining



