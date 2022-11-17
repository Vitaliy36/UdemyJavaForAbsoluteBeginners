package oop;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setHeight(5);
        r1.setWidth(9);
        r1.setHeight(3); // here is h will be change to 3. If write negative number or 0 program will ignire it and take 5
        r1.printArea();


        Rectangle r2 = new Rectangle();
        r2.setHeight(8);
        r2.setWidth(4);
        r2.setWidth(-2);
        r2.printArea();

        System.out.println("r1 height: " + r1.getHeight());
        System.out.println("r1 width: " + r1.getWidth());
        System.out.println("r2 height: " + r2.getHeight());
        System.out.println("r2 width: " + r2.getWidth());
        System.out.println("r1 area: " + r1.getArea());
        System.out.println("r1 perimeter: " + r1.getPerimeter());
    }
}
