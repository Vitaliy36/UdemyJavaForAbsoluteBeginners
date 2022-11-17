package ifElse;

import java.util.Scanner;

public class LexicalScope {
    public static void main(String[] args) {

        int numPets;

        if (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of pets you own: ");
            numPets = scanner.nextInt();
        }

        System.out.println("You have " + numPets + " pets.");

    }


}
