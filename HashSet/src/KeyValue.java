//Get keys from value in HashMap

import java.util.HashMap;
import java.util.Map;

public class KeyValue {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 1);

        int searchValue = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == searchValue) {
                System.out.println("Key with value " + searchValue + ": " + entry.getKey());
            }
        }
    }
}
