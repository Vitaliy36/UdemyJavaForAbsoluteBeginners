package methods;

public class PassingAndReturningData {
    public static void main(String[] args) {
        System.out.println(countVolume(4, 5));
        System.out.println(countVolume(10, 15));
    }
    public static double countVolume(double r, double h) {
        return Math.PI * r * r * h / 3;
    }
}
