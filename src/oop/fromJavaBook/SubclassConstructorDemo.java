package oop.fromJavaBook;

public class SubclassConstructorDemo {
    public static void main(String[] args) {
        // Subclass object variable
        Bravo bravo;

        //Creating an object subclass
        bravo = new Bravo();
        bravo = new Bravo("Red");
        bravo = new Bravo(100);
        bravo = new Bravo("Green", 200);
        bravo = new Bravo('Y');
        bravo = new Bravo("Blue", 300, 'Z');
    }
}
