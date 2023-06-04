package homework_week5;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to test if an array list is empty or not.
 */

public class Program7_ArrayListEmptyOrNot {

    public static void main(String[] args) {
        checkArrayEmpty();
    }

    public static void checkArrayEmpty(){
        List<String> list_Strings = new ArrayList();
        list_Strings.add("Audi");
        list_Strings.add("Honda");
        list_Strings.add("BMW");
        list_Strings.add("Ford");
        list_Strings.add("Toyato");

        System.out.println("Original array list: " + list_Strings);
        System.out.println("Checking the above array list is empty or not! : "+list_Strings.isEmpty());
        list_Strings.removeAll(list_Strings);
        System.out.println("Array list after remove all elements "+list_Strings);
        System.out.println("Checking the above array list is empty or not! : "+list_Strings.isEmpty());
    }
}
