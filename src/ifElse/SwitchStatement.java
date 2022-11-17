package ifElse;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered one");
                break;
            case 2:
                System.out.println("You entered two");
                break;
            case 3:
                System.out.println("You entered three");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }

    }
}
