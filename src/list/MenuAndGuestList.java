package list;

import java.util.Scanner;

public class MenuAndGuestList {

    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        insertTestNames();

        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                addGuest();

            }
            else if (option == 2) {
                insertGuest();
            }
            else if (option == 3) {
                renameGuest();

            }

            else if (option == 4) {
                removeGuest();

            }
            else if (option == 5) {
                System.out.println("Exiting...");
                break;
                }

        } while (true);
    }

    static void displayGuests() {

        System.out.println("-----------------------------\n - Guests - \n");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
//                    if (guests[i] == null) {
//                        System.out.println("--");
//                    } else {
//                        System.out.println(guests[i]);
//                    }
            // This code: System.out.println(guests[i] == null ? "--" : guests[i]); use instead if statement
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Guest list is empty");
        }
    }

    static void displayMenu() {
        System.out.println("-----------------------------\n - Menu - \n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Insert Guest");
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Remove Guest");
        System.out.println("5 - Exit");

    }

    static int getOption() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;

    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.println("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }

    }

    static void insertGuest() {
        System.out.println("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >= 1 && num <= 10 && guests[num - 1] != null) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            for (int i = guests.length - 1; i > num - 1; i--) {
                guests[i] = guests[i - 1];
            }

            guests[num - 1] = name;
        }
        else {
            System.out.println("\nErrors: There is no guest with that number.");
        }

    }

    static void renameGuest() {
        System.out.println("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >= 1 && num <= 10 && guests[num - 1] != null) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            guests[num - 1] = name;
        }
        else {
            System.out.println("\nErrors: There is no guest with that number.");
        }
    }


    static void removeGuest() {
        System.out.println("Number: ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 10 && guests[num -1] != null) {
            guests[num - 1] = null;

            String[] temp = new String[guests.length];
            int ti = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    temp[ti] = guests[i];
                    ti++;
                }
            }
            guests = temp;

        }
        else {
            System.out.println("\nErrors: There is no guest with that number.");
        }
    }

    static void insertTestNames() {
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Victor";

    }
}