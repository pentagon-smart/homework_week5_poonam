package homework_week5;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Program6_RetrieveArrayList {

    public static void main(String[] args) {
        retrieveElement();
    }

    public static void retrieveElement(){
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Audi");
        list_Strings.add("Honda");
        list_Strings.add("BMW");
        list_Strings.add("Ford");
        list_Strings.add("Toyato");
        // Print the list
        System.out.println(list_Strings);
        // Retrieve the first and third element

        System.out.println("First element: " + list_Strings.get(0));
        System.out.println("First element: "  + list_Strings.get(2));
    }
}
