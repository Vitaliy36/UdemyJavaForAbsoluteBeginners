package methods;

import java.util.Scanner;

public class StaticMethod {

    static int x = 5; // here X is not a local variable, it is a global variable. X variable has to be static
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(x);

        foo();
        bar();
    }

    static void foo() { // WE don't need public status because public key word only becomes dealing with miltiple classes. But we have just one class (Main)
        double d = scanner.nextDouble();
        System.out.println(x);
        System.out.println(d);
        x = 10;

    }

    static void bar() {
        String str = scanner.next();
        System.out.println(x);
        System.out.println(str);

    }
}
