package variableScanner;

import java.util.Scanner;

public class CodingChallenge2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + age * 2 + " years old");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);*/




        // Write a program which divides a restaurant bill so that each person pays an equal amount.
        // Take a look at the hints below if you get stuck.
        //
        //Hint 1: Prompt the user for the necessary input.
        // Then do some calculation with that input, and print the result.
        //
        //Hint 2: Using the Scanner, ask for the bill total and the number of people it will be split between.
        //
        //Hint 3: Divide the bill total by the number of people to calculate
        // how much each person should pay, and print the result.

        System.out.print("Enter bill total: $");
        double billTotal = scanner.nextDouble();

        System.out.print("Enter number of people:");
        int numPeople = scanner.nextInt();

        double eachPay = billTotal / numPeople;

        System.out.format("A bill of $%.2f split between " + numPeople + " people comes to approximately $%.2f each" + billTotal, eachPay);



    }
}
