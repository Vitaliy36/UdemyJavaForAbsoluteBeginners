package oop;

import java.util.ArrayList;

public class ArrayListt<S> {
    public static void main(String[] args) {
        String[] sa = new String[5];
        sa[0] = "Toaster";
        sa[1] = "Fridge";
        sa[2] = "Kettle";
        System.out.println(sa[2]);

        ArrayList<String> sal = new ArrayList<>();
        sal.add("toaster");
        sal.add("fridge");
        sal.add("kettle");
        System.out.println(sal.get(1));
        sal.set(1, "microwave");
        System.out.println(sal.get(1));
        System.out.println(sal.size());
        sal.clear();
        System.out.println(sal.size());
    }
}
