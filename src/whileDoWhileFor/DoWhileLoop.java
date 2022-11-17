package whileDoWhileFor;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String again;

        do {


            int num = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("Your rolled a " + num + ".");
            System.out.print("Stop rolling y/n: ");
            again = scanner.next();


        } while (!again.equals("y"));



//        int i = 0;
//
//        do{
//            i++;
//        }while (i < 5);
//
//        while (i < 5) {
//            i++;
//        }
    }
}
