package methods;

public class ReturningDataFromMethod {
    public static void main(String[] args) {
        foo(3);
        System.out.println(bar());

    }
    public static void foo(int a) {
        if (a < 5) {
            return; // If (if statement is true then return returns us to main method, If if statement is false then return return skip
        }
        System.out.println(a);

    }

    public static double bar() {
        return 49.5;

    }
}
