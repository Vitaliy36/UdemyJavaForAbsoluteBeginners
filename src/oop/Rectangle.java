package oop;

public class Rectangle {
    // As a rule of thumb, variable should always be private and
    // methods will either be public or private
    private int heigth;
    private int width;

    public void setHeight(int h) { //Why method should be private or public not just void???
        //We do not want to rectangle was 0 or negative. We have to do next
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

    public void printArea() {
        System.out.println(heigth * width);
    }
}
