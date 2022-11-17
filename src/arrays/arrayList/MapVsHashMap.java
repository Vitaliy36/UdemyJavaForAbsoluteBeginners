package arrays.arrayList;

import java.util.HashMap;

public class MapVsHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Vitaliy", 12345); // todo replace
        empIds.put("Carl", 64738);
        empIds.put("Adam", 46273);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("Vitaliy"));
        System.out.println(empIds.containsValue(12345));

        empIds.put("Vitaliy", 54321);
        System.out.println(empIds);

        //Different between 'replace' and 'put':
        //When you run 'replace' and this key doesn't exist in your map yet it won't do anything
        //It will only replace the current value of it does exist whereas 'put' if it doesn't exist will go ahead and add it to the map.
        empIds.replace("Karen", 99999);
        System.out.println(empIds);

        //putIfAbsent put if absent only and update of the key value pair if it's not already current in the map
        empIds.putIfAbsent("Vitaliy", 2222); // Vitaliy is already in the map
        empIds.putIfAbsent("Vova", 67432); // Vova is absent and it was added.
        System.out.println(empIds);

        empIds.remove("Vova");
        System.out.println(empIds);


    }
}
