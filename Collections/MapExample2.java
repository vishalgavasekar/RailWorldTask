package Collections;
import java.util.*;
public class MapExample2 {



        public static void main(String[] args) {
            // Create a map
            Map<String, Integer> map = new HashMap<>();


            map.put("apple", 10);
            map.put("banana", 20);
            map.put("orange", 15);

            // Check if the map contains a specific key
            String keyToCheck = "apple";
            if (map.containsKey(keyToCheck)) {
                System.out.println("Map contains the key: " + keyToCheck);
            } else {
                System.out.println("Map does not contain the key: " + keyToCheck);
            }

            // Check if the map contains a specific value
            int valueToCheck = 20;
            if (map.containsValue(valueToCheck)) {
                System.out.println("Map contains the value: " + valueToCheck);
            } else {
                System.out.println("Map does not contain the value: " + valueToCheck);
            }
        }
    }
