package ifElse;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWork {
    public static void main(String[] args) {

        //      Tesk 1

//        int x = 2;
//        int y = 2;
//
//        if(x > y) {
//            System.out.println("x is bigger than y");
//        }
//        else if (y > x) {
//            System.out.println("x is smaller that y");
//        }
//        else {
//            System.out.println("x and y are the same");
//        }



                     //Task 2

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("I am thinking of a number from 1 to 5. Try to guess it.");
        System.out.println("You have two chances");
        System.out.println("Your guess: ");

        Scanner scanner = new Scanner(System.in);
        int guestNum = scanner.nextInt();

        if(randomNumber == guestNum) {
            System.out.println("Correct! Are you lucky.");

        }
        else {
            System.out.println("Your number doesn't match with mine, try again ");
            guestNum = scanner.nextInt();
        }

         if (randomNumber == guestNum) {
            System.out.println("Correct! Are you lucky.");
        }
        else {
            System.out.println("Hurd luck! Maybe next time");
        }
    }
}
