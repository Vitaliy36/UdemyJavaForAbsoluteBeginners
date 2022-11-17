package arrays.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++)
            arrayList.get(i);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for ArrayList is: " + (end - start) + " mc");

        start = System.currentTimeMillis();
//        for (int i = 0; i < linkedList.size(); i++)
//            linkedList.get(i);
        //LinkedList is slower than ArrayLIst because LinkedList sort out constantly start from the beginning.
        //To solve that problem and make LinkedList faster we have to use "Iterator"
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext())
            iterator.next();
        end = System.currentTimeMillis();
        System.out.println("Time taken fot ArrayList is: " + (end - start) + " mc");
    }
}
