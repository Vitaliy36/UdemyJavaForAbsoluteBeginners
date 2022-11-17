package tutor;

public class Line {
    Point pointA;
    Point pointB;

    public Line(Point pointStart, Point pointEnd) {
        this.pointA = pointStart;
        this.pointB = pointEnd;

    }

    public double length() {
        //Math.sqrt - квадратний корінь
        // Math.pow - піднесення до ступеня
        return Math.sqrt(Math.pow(this.pointA.x - this.pointB.x, 2)
                + Math.pow(this.pointA.y - this.pointB.y, 2));

//        double length = Math.sqrt(Math.pow(this.pointA.x - this.pointB.x, 2) + Math.pow(this.pointA.y - this.pointB.y, 2));
//        return length;
    }

    public static void main(String[] args) {
//        Point point1 = new Point(2, 5);
//        Point point2 = new Point(2, 8);
//        Line line1 = new Line(point1, point2);
//        System.out.println(line1.length());
//        System.out.println();

       Point pointA = new Point(0, 0);
       Point pointB = new Point(0, 3);
       Point pointC = new Point(4, 0);
       TriangleHW triangleHW = new TriangleHW(pointA, pointB, pointC);
       System.out.println(triangleHW.perimeter());
       // Concatenation
       System.out.println("Result equal " + triangleHW.area());

    }
}
