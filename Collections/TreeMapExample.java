package Collections;
import java.util.*;

public class TreeMapExample {

        public static void main(String[] args) {
            Map<String,String> map2 = new TreeMap<>();
            map2.put("key", null);
            map2.put("foo", "bar");
            map2.put("baz", null);
            map2.put("hello", "world");
            System.out.println(map2);
        }
    }
