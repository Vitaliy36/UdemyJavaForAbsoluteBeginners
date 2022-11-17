package methods;

import java.util.Scanner;

public class References {
    public static void main(String[] args) {

        int a = 10; // In variable data types you can change the value or reasign but you can not do it in Array
        int b = a;
        b = 20;

        int[] x = {3, 22, 4, 16, 8}; // Arrays are stored elsewhere in memory in some random memory location. What X contains in the memory of that location
    //  int[] y = x; // Here Y will stored ([I@c818063) it is location.
                    //All Arrays are reference types.
       int[] d = foo(x);
       d[4] = 35;

        //Scanner scanner = new Scanner(System.in); // Scanner is also reference types

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static int[] foo(int[] c) {
        c[1] = 50;
        return c;
    }

}
