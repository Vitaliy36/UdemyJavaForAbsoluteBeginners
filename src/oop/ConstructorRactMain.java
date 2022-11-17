package oop;

public class ConstructorRactMain {
    public static void main(String[] args) {
        ConstructorRactangle r1 = new ConstructorRactangle(7, 9);

        ConstructorRactangle r2 = new ConstructorRactangle(8, -4);

        System.out.println(r1.getHeight() + ", " + r1.getWidth());
        System.out.println(r2.getHeight() + ", " + r2.getWidth());

    }
}
