package arrays;

import java.util.Scanner;

public class SizesTypes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String[] predictions = new String[3];
       predictions[0] = "a pioneer";
       predictions[1] = "loved by many";
       predictions[2] = "very wealthy";

        System.out.println("I will predick your future. Chose 1, 2 or 3: ");
        int chose = scanner.nextInt();

        System.out.println("In your future you will be " + predictions[chose -1]);
    }
}
