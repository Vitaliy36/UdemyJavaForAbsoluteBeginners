package oop;

import java.util.Scanner;

public class ThingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Thing thing = new Thing();
        thing.num = 5;
        thing.word = "Hello";

        Thing thing2 = new Thing();
        thing2.num = 21;
        thing2.word = "Whatever";

        System.out.println(thing.num + thing2.num);
        // So we have two instances of Things and one instance of Scanner

        thing.foo();
        thing2.foo();
    }
}
