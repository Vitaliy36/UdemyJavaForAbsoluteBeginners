package tutor;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListLanguages {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("Java");
        arr1.add("Java-Script");
        arr1.add("Python");
        arr1.add("C#");
        System.out.println(arr1);

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Ruby");
        arr2.add("HTML");
        System.out.println(arr2);

//        arr1.addAll(arr2);
//        System.out.println(arr1);
//
//        arr2.addAll(1, arr1.subList(1, 4));
//        System.out.println(arr2);
//
//        arr1.clear();
//        System.out.println(arr1);


       ArrayList<String> cloneList = (ArrayList<String>)arr1.clone();
        System.out.println("Clone is " + cloneList);

        System.out.println("contains: " + arr1.contains("Python"));
        System.out.println("contains: " + arr1.contains("C++"));
        System.out.println("indexOf: " + arr1.indexOf("C#"));
        System.out.println(arr1.indexOf("C#") > 0);

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Bobby", "Alex", "Bobby", "Suzy", "John"));
        System.out.println("List: " + list);

        int i = list.lastIndexOf("Bobby");
        System.out.println("Last indexOf " + i);



    }
}
