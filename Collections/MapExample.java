package Collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Create a Map object
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 15);

        // Access value by key
        System.out.println("Value of 'apple': " + map.get("apple"));

        // Check if key exists
        if (map.containsKey("banana")) {
            System.out.println("Key 'banana' exists");
        }

        // Iterate over keys
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Iterate over values
        System.out.println("Values:");
        for (int value : map.values()) {
            System.out.println(value);
        }

        // Iterate over key-value pairs
        System.out.println("Key-Value pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove a key-value pair
        map.remove("orange");

        // Check size
        System.out.println("Size of map: " + map.size());

        // Clear all elements
        map.clear();

        // Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());
    }
}
