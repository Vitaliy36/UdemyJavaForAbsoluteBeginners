package interviewTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    //Reverse String use StringBuilder
    public static void main(String[] args) {
        String str = "Vitaliy Kulbaba";
       StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }
}
