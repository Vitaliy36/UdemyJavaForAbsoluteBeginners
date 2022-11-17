package lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapp {
    public static void main(String[] args) {
        Map<String, String> fruits = new HashMap<>();
        List<String> arrayList = new ArrayList();

        fruits.put("Red", "Apple");
        fruits.put("Yellow", "Banana");
        fruits.put("White", "Radish");
        fruits.put("Green", "Apple");

        fruits.containsKey("Red"); // returns true if key is found
        System.out.println("containsKey - " + fruits);
        fruits.containsValue("Apple"); // returns true if value is found
        System.out.println("containsValue - " + fruits);
        fruits.size(); // return the size of the Map
        System.out.println("size - " + fruits);
        fruits.remove("Red"); // deletes the entry whose key is "red"
        System.out.println("remove - " + fruits);

//        fruits.putIfAbsent("Red", "Banana");
//        fruits.putIfAbsent("Blue", "Blueberry");
//        System.out.println(fruits);
        System.out.println("putIfAbsent - " + fruits.putIfAbsent("Red", "Banana"));
        System.out.println("putIfAbsent 2 - " + fruits.putIfAbsent("Blue", "Blueberry"));

        System.out.println("get - " + fruits.get("Yellow"));
//        fruits.clear();
//        System.out.println("clear - " + fruits);


        System.out.println("get: " + fruits.get("Red"));
        System.out.println();

        for (Map.Entry pairEntry : fruits.entrySet()) {
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }
    }
}
