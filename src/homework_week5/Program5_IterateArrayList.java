package homework_week5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Program5_IterateArrayList {

    public static void main(String[] args) {

        iterateArray();

    }

    public static void iterateArray() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        for (String element : list_Strings) {
            System.out.println(element);
        }
        Iterator<String> colour = list_Strings.iterator();
        while (colour.hasNext()) {
            System.out.println(colour.next());
        }

    }
}
