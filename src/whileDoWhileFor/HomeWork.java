package whileDoWhileFor;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWork {
    public static void main(String[] args) {

        // Exercise 1

//        for (int i = 89; i <= 117; i++) {
//            System.out.println(i);
//        }
//        System.out.println("------------------------------------------------");

        // Exercise 2
        // Write a program which prints numbers from 1 to 40. After every third number, print "Quack"
//        int count = 1;
//        for (int b = 1; b <= 40; b++) {
//            System.out.println(b);
//
//            if (count == 3) {
//                System.out.println("Quack");
//                count = 0;
//            }
//            count++;
//        }
//
//        System.out.println("--------------------------------------------------");

        // Exercise 3
//        Scanner scanner = new Scanner(System.in);
//        String password;
//
//        do {
//            System.out.print("Enter password: ");
//            password = scanner.next();
//        }while (!password.equals("shark50"));
//
//        System.out.println("ACCESS APPROVED");
//        System.out.println("----------------------------------------------------");


        //Exercise 4
        //Write a program which use of a loop to the following output: 0,1,2,3,4,5,6,7,8,9,10
//
//        for (int y = 0; y <= 10; y++) {
//            System.out.print(y + ", ");
//        }
//        System.out.println("\b\b.");


        //Exercise 5 and 6
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int guessesNum = 0;

        System.out.print("Please enter your number: ");

        do {
            System.out.println("\nGuess: ");
            guess = scanner.nextInt();
            guessesNum++;

            if (guess < randomNumber) {
                System.out.println("HIGHER");
            } else if (guess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
                System.out.println("Number of guesses: " + guessesNum);
            }


        }   while (guess != randomNumber) ;

    }
}
