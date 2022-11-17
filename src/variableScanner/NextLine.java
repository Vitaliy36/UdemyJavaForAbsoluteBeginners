package variableScanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println(userName + " is your name");
    }
}
