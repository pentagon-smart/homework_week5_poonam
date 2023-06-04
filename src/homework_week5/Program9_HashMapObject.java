package homework_week5;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Program9_HashMapObject {

    public static void main(String[] args) {

        peopleObject();
    }

    public static void peopleObject(){
        Map<Integer, String> people  = new HashMap<>();

        people.put(1, "BMW");
        people.put(6, "Audi");
        people.put(2, "Honda");

        for(Map.Entry<Integer,String>   car    : people.entrySet()){
            System.out.println(car.getKey()+" " +car.getValue());

        }

    }
}
