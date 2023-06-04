package homework_week5;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Program4_ArrayColourList {

    public static void main(String[] args) {
       colourString();
    }

    public static void colourString(){
        List<String> list_Strings = new ArrayList();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        for (String name : list_Strings) {
            System.out.println(name);
        }

    }
}
