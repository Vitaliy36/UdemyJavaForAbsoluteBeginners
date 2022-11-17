package variableScanner;

import java.util.Scanner;

public class ScanerYourName {
    public static void main(String[] args) {

//        System.out.println(4.5 - 2.7);  // 1.799999999999
//        System.out.format("When formatted: %.1f", 4.5 - 2.7);
//        System.out.println();
//        System.out.format("I have %d cats, %f dogs, %.1f tigers, and 1 %s", 7, 2.9, 2.9, "panther");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name");

        System.out.println("\nHow old are you " + userName + "?");
        int usarAge = scanner.nextInt();
        System.out.println(userName + " is " + usarAge + " years old");

        System.out.println("\nHow tall are you in meters?");
        double userHeight = scanner.nextDouble();
        System.out.println("Your name is " + userName + " you are " + usarAge + " years old" + " and " + userHeight + " meters tall");

        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.62;
        System.out.println("\nThe difference between your height and the average is: ");
        System.out.format("%.2fm if you are male \n", averageMaleHeightDifference);
        System.out.format("%.2fm if you are female", averageFemaleHeightDifference);
    }
}
