package variableScanner;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        int age                     = 17;
        double statueHeightInMetres = 15.5;
        boolean hasDriverLicense    = true;
        char userInput              = '\u005A';
        String name                 = "Vitaliy";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input + " " + name);
    }
}
