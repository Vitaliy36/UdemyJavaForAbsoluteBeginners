package tutor.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RedefineArrayList {

    // Generic function to convert an ArrayList to LinkedList
    public static <T> List<T> convertALtoLL(List<T> aL) {

        // Create an empty LinkedList
        List<T> lL = new LinkedList<>();

        // Iterate through the aL
        for (T t : aL) {

            // Add each element into the lL
            lL.add(t);
        }
        // Return the converted LinkedList
        return lL;
    }

    public static void main(String[] args) {
        // Create an ArrayList
//        ArrayList<String> aL = new ArrayList<String>();
//        aL.add("Just do");
//        aL.add("It");
//        aL.add("Nothing");
//        aL.add("Is Impossible");
//        aL.iterator().next();
//
//        // Print the ArrayList
//        System.out.println("ArrayList: " + aL);
//
//        // convert the ArrayList to LinkedList
//        List<String> lL = convertALtoLL(aL);
//        lL.iterator().next();
//
//        // Print the LinkedList
//        System.out.println("LinkedList: " + lL);
        ArrayList<String> allTimes = new ArrayList<>();

        long timeStart = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        allTimes.add("ArrayListAdd: " + (System.currentTimeMillis() - timeStart));

        timeStart = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        allTimes.add("LinkedListAdd: " + (System.currentTimeMillis() - timeStart));


        timeStart = System.currentTimeMillis();
        for (int i = 20000; i < 21000; i++) {
            arrayList.add(i, 333);
        }
        allTimes.add("ArrayListAdd after remove: " + (System.currentTimeMillis() - timeStart));

        timeStart = System.currentTimeMillis();
        for (int i = 20000; i < 21000; i++) {
            linkedList.add(i, 333);
        }
        allTimes.add("LinkedListAdd after remove: " + (System.currentTimeMillis() - timeStart));

        timeStart = System.currentTimeMillis();
        for (int i = 20000; i < 21000; i++) {
            arrayList.remove(i);
        }
        allTimes.add("ArrayListRemove: " + (System.currentTimeMillis() - timeStart));

        timeStart = System.currentTimeMillis();
        for (int i = 20000; i < 21000; i++) {
            linkedList.remove(i);
        }
        allTimes.add("LinkedListRemove: " + (System.currentTimeMillis() - timeStart));

        //  System.out.println("ArrayListTime " + (timeEnd - timeStart));
        System.out.println(allTimes);


    }
}
