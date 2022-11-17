package methods;

public class PassingDataToMethod {
    public static void main(String[] args) {
         int var;
         var = 5;
         foo(var, 57, " caramel");


    }

    public static void foo(int a, double b, String c) {
        System.out.println(a + b + c);

    }
}
