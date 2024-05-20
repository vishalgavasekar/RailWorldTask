package Collections;
import java.util.*;

    public class MapExample1 {
        public static void main(String[] args) {
            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();

            // Add key-value pairs to map1
            map1.put("apple", 10);
            map1.put("banana", 20);

            map2.put("orange", 15);
            map2.put("grape", 25);

            map1.putAll(map2);

            System.out.println("Merged Map:");
            for (Map.Entry<String, Integer> entry : map1.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

