package methods;

public class Introduction {
    public static void main(String[] args) {

        System.out.println(19);
        bar();
        foo();
        System.out.println(24);

    }

    public static void foo() {
        int x = 50;
        System.out.println(x);
        System.out.println(16);
        bar();

    }

    public static void bar() {
        foo();
        System.out.println(12);
    }
}
