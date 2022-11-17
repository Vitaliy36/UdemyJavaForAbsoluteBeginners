package oop;

public class ConstructorRactangle {
    private int heigth = 1;
    private int width = 1;

    // Constructors have two defining features:
    //1. They must have the same name as the class (ConstructorRactangle)
    //2. Constructors have no return type at all.
    public ConstructorRactangle(int h, int w) {
        setHeight(h);
        setWidth(w);
    }

    public void setHeight(int h) {
        if (h > 0) {
            heigth = h;
        }
    }

    public int getHeight() {
        return heigth;
    }

    public void setWidth(int w) {
        if (w > 0) {
            width = w;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return heigth * width;
    }

    public int getPerimeter() {
        return (2 * heigth) + (2 * width);
    }
}
