/**
 * Created by vundicind on 3/3/17.
 */
public class Foo {
    public Foo() {
        System.out.println("Object was created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object will be destroyed at the next garbage collection cycle");
    }
}
