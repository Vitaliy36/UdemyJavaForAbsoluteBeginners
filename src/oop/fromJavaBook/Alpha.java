package oop.fromJavaBook;

//SuperClass
public class Alpha {
    String name;
    int code;

    // Constrictor with three arguments
    Alpha(String name, int code) {
        this.name = name;
        this.code = code;

        System.out.println("Class Alpha");
        System.out.println("Name - " + this.name);
        System.out.println("Code - " + this.code);
    }

    //Constrictor with a String arguments
    Alpha(String name) {
        //Call the Constrictor with two arguments
        this(name, 0);
    }

    //Constrictor with a int arguments
    Alpha(int code) {
        //Call the Constrictor with two arguments
        this("White", code);
    }

    // Constrictor with no arguments
    Alpha() {
        this("Yellow", 1);
    }
}

