package p2;

public class A {

            // A iS a SUPERCLASS or Parent class
    // if not access modifier (line 10) at all this is called Package-Private access
    // It is means is only inherited by a subclass if the two classes are in the same package
    public int v1 = 5;
    protected int v2 = 10;
    int v3 = 15;
    private int v4 = 20;

    public void m1() {
        System.out.println("something");
    }
}
