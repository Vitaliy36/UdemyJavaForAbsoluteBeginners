package tutor.urkaineHW;

import java.util.ArrayList;

public class Exam {
    public static void main(String[] args) {

        ArrayList<String> elements = new ArrayList<>();
        elements.add("House");
        elements.add("Car");
        elements.add("Bike");

        ArrayList<String> elements2 = new ArrayList<>();
        elements2.add("Water");
        elements2.add("Gas");

        elements2.addAll(elements);
        elements2.remove(0);
        elements2.remove(elements2.size() -1);
        elements2.remove(elements2.size() -1);

        elements2 = (ArrayList<String>) elements.clone();

        System.out.println(elements);
        System.out.println(elements2);

       if (elements.equals(elements2)){
           System.out.println("Elements are equal");
       }else
           System.out.println("Elements are not equal");

       elements.isEmpty();
       

    }
}
