public class Main {

    public static void main(String[] args) {
        String foo = "foobar";
        String bar = "foobar";
        String baz = new String("foobar");

        System.out.println("foo == bar " + (foo == bar));
        System.out.println("foo == baz " + (foo == baz));
        System.out.println("foo.equals(bar) " + foo.equals(bar));
        System.out.println("foo.equals(baz) " + foo.equals(baz));

        String qux = new String("qux");
        System.out.println("qux == qux.intern() " + (qux == qux.intern()));
        String quux = "qux";
        System.out.println("quux == qux.intern() " + (quux == qux.intern()));
    }
}
