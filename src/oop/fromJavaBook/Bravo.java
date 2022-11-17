package oop.fromJavaBook;

public class Bravo extends Alpha {
    char symbol;

    private void show() { //Method is close because of private and
        //can be called just in class Bravo
        System.out.println("Class Bravo:");
        System.out.println("Symbol - " + this.symbol);

        //next code for horizontal line
        for (int i = 1; i <= 18; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    // Constrictor with three arguments
    Bravo(String name, int code, char symbol) {

        //Call SyperClass(Alpha) constructor with two arguments
        super(name, code);

        //Assigning a value to symbol(char symbol) field
        symbol = symbol;

        //call close method
        show();

        }

    //Constrictor with one symbol argument
    Bravo(char symbol) {

        //Call SyperClass(Alpha) constructor with no arguments:
        super();

        //Assigning a value to symbol(char symbol) field
        symbol = symbol;

        //call close method:
        show();

    }
    //Constrictor with one String argument
    Bravo(String name) {
        //Call SuperClass(Alpha) constructor with no arguments:
        super(name);

        //Assigning a value to symbol(char symbol) field
        symbol = 'A';

        //call the close method:
        show();
    }
    //Constrictor with a int arguments
    Bravo(int code) {

        //Call SuperClass(Alpha) constructor with one arguments:
        super();

        //Assigning a value to symbol(char symbol) field
        symbol = 'B';

        //call the close method:
        show();
    }

    // Constrictor with no arguments
    Bravo() {

        //Call SuperClass(Alpha) constructor with no arguments and
        //Assigning a value to symbol(char symbol) field
        symbol = 'C';
        //call the close method:
        show();
    }

    // Constrictor with two arguments
    Bravo(String name, int code) {

        //Call the subclass constructor with three arguments
        this(name, code, 'D');
    }

}
