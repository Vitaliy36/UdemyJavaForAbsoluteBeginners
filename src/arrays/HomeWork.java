package arrays;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
                //Exercise 1
                //Create an integer array of 10 elements and give each element an arbitrary value.
                //Print out the entire array using a loop.
//        int[] elements = new int[10];
//        elements[0] = 1;
//        elements[1] = 12;
//        elements[2] = 121;
//        elements[3] = 11;
//        elements[4] = 1223;
//        elements[5] = 125;
//        elements[6] = 10;
//        elements[7] = 52;
//        elements[8] = 782;
//        elements[9] = 222;
//
//        for (int i = 0; i < elements.length; i++) {
//            System.out.println(elements[i]);
//        }


                //Exercise 2
        int[] arrNum = new int[20];

        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = i + 1;

        }

            for (int b = arrNum.length -1; b >= 0; b-- ) {
                System.out.println(arrNum[b]);
            }

            //Exercise 3
        double[] num = new double[5];
            num[0] = 23.5;
            num[1] = 32.1;
            num[2] = 78.0;
            num[3] = 45.9;
            num[4] = 80.5;

        double sumNum = 0;
        for (int i = 0; i < num.length; i++) {
                sumNum += num[i];


                double mean = sumNum / num.length;
                System.out.println(sumNum);
            System.out.println(mean);
            }

        //Exercise 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five favorite foods");

       String[] foods = new String[3];
       for (int i = 0; i < foods.length; i++) {
           System.out.print("Food " + (i + 1) + " :");
           foods[i] = scanner.nextLine();
       }
        System.out.println("No more memory available \n");

        System.out.println("YOur favorite food are: ");
       for (int i = 0; i < foods.length; i++) {
           System.out.println(" - " + foods[i]);
       }
    }
}
