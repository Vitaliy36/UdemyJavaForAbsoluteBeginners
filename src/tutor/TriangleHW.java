package tutor;

public class TriangleHW {

    //Змінні (властивості) класу
    Point a;
    Point b;
    Point c;

    public TriangleHW(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        Line ab = new Line(a, b);
        Line bc = new Line(b, c);
        Line ca = new Line(c, a);
        double per = ab.length() + bc.length() + ca.length();
        return per;

    }

    public double area() {
        Line ab = new Line(a, b);
        Line bc = new Line(b, c);
        Line ca = new Line(c, a);
        double per = (ab.length() + bc.length() + ca.length()) / 2;
        // ab -> 0, 0 and 0, 3
        double ar = Math.sqrt(per * (per - ab.length()) * (per - bc.length()) * (per - ca.length()));
        return ar;
    }
}
