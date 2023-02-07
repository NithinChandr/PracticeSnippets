//Get keys from value in HashMap

import java.util.*;

public class Keys {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);
        map.put("key4", 3);
        map.put("key5", null);
        map.put(null, 3);

        for (String key : getKeys(map, 3)) {
            System.out.println(key);
        }

    }

    private static Set<String> getKeys(Map<String, Integer> map, Integer value) {

        Set<String> result = new HashSet<>();
        if (map.containsValue(value)) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (Objects.equals(entry.getValue(), value)) {
                    result.add(entry.getKey());
                }
            }
        }
        return result;

    }
}
