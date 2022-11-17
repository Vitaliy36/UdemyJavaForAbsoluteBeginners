package tutor;

import arrays.ForeachLoop;

import java.util.ArrayList;

public class ArrayListFruits {

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            String coma = (i == arr.length -1) ? "" : ", "; // Ternar operator
            System.out.print(arr[i] + coma);
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Peach";
        fruits[2] = "Watermelon";
        System.out.println(fruits[1]);
        printArray(fruits);

        ArrayList fruitsList = new ArrayList();
        fruitsList.add("Apple");
        fruitsList.add(10);
        fruitsList.add("Watermelon");
        fruitsList.add(1, "Apricot");
      //  fruitsList.addAll();
        System.out.println(fruitsList);

        MyArrayList<String> products = new MyArrayList<>();
        products.add("Apple");
        products.add("Apricot");
        products.add("Orange");
        products.add("Watermelon");
        System.out.println(products.get(2));
        System.out.println(products);

        System.out.println("---------------------------");
        products.remove("Watermelon");
        System.out.println(products);
        System.out.println("-----------------------------");

        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains("Apple"));
        System.out.println(products.contains("Nuts"));

        MyArrayList<String> products2 = new MyArrayList<>();
        products2.add("Potato");
        products2.add("Tomato");
        products2.add("Cucumber");
        products2.add("Garlic");
        System.out.println(products2.size());
        System.out.println(products2.isEmpty());
        System.out.println(products2.contains("Orange"));

        products.addAll(products2);
        System.out.println("addAll method: " + products);
        products.set(3, "Melon");
        System.out.println("Set method: " + products);
        products.clear();
        System.out.println("Clear method: " + products);


        System.out.println("--------------------------------------------------------");
        ArrayList<String> groceryList = new ArrayList<String>();
        groceryList.add("Milk");
        groceryList.add("Meat");
        groceryList.add("Eggs");
        groceryList.add("Bread");
        groceryList.add("Butter");
        System.out.println(groceryList);

        int size = groceryList.size();
        System.out.println("size " + size);

        groceryList.remove("Meat");
        System.out.println("remove by object " + groceryList);
        groceryList.remove(0);
        System.out.println("remove by index " + groceryList);

        String get = groceryList.get(1);
        System.out.println("Grocery List before get method " + groceryList);
        System.out.println("get " + get);

        groceryList.add(1, "Milk");
        System.out.println("add by index & element " + groceryList);
        groceryList.add("Meat");

        ArrayList groceryList2 = new ArrayList();
        groceryList2.add("Water");
        groceryList2.add("Oil");
        groceryList2.add("Carrots");

        groceryList.addAll(groceryList2); //?? Why I can't add product or prod2?
        System.out.println("addAll " + groceryList);
        groceryList.set(0, "Buttermilk");
        System.out.println("set "  + groceryList);
        groceryList.remove(7); // last index
        System.out.println("remove index " + groceryList);
        groceryList.remove("Bread");
        System.out.println("remove object " + groceryList);


        ArrayList  cloneList = (ArrayList) groceryList2.clone();
        System.out.println("clone " + cloneList);

        Boolean contains = groceryList.contains("Eggs");
        System.out.println("Grocery List before contains method " + groceryList);
        System.out.println("contains " + contains);

        groceryList.ensureCapacity(2); // ??? How it is works
        System.out.println("ensureCapacity " + groceryList);

//        groceryList.equals(groceryList2); //??? Has to be Boolean?
//        System.out.println("equals " + groceryList);

        if (groceryList.equals(groceryList2)) {
            System.out.println("The lists are equal");
        }
        else {
            System.out.println("The lists are not equal");
        }

        int indexOF = groceryList.indexOf("Oil");
        System.out.println("Grocery List before indexOf method " + groceryList);
        System.out.println("indexOf " + indexOF);
        int hashCode = groceryList.hashCode();
        System.out.println("hashCode " + hashCode);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < groceryList.size(); i++) {
            list.add(i);
            System.out.println(groceryList.get(i).hashCode());
        }
        System.out.println("hashCode " + list.hashCode());

        if (!groceryList.isEmpty()) { // isEmptyMethod
            groceryList.addAll(groceryList2);
            System.out.println("isEmptyMethod Here is your shopping list " + groceryList);
        }
        else
            System.out.println("isEmptyMethod We will do shopping next week");

        groceryList.lastIndexOf("Oil");
        System.out.println("lastIndexOf " + groceryList);


        ArrayList remove = new ArrayList();
        remove.add("Water");
        remove.add("Oil");
        System.out.println(groceryList2);
        groceryList2.removeAll(remove); // Why does removeAll want in parentheses??
        System.out.println("removeAll " + groceryList2);
       // System.out.println(groceryList);


    }
}
