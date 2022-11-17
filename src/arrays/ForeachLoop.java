package arrays;

import tutor.ArrayListFruits;

public class ForeachLoop {
    public static void main(String[] args) {
        double[] da = new double[] {25, 92, 1.34, -76.24, 833.11, 76.884};
        String[] string = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday",  "Thurstday", "Friday", "Saturday"};

        // forLoop
//        for (int i = 0; i < da.length; i++) {
//            double e = da[i];
//            System.out.println(e);
//        }

        //forEachLoop
        for (double e : da) {
            System.out.println(e);
        }

        System.out.println("--------------------------------");

        for (String s : string) {
            System.out.println(s);
        }


    }
}
