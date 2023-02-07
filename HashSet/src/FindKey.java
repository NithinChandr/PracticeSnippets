import java.util.*;
import java.util.stream.Collectors;

public class FindKey {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);
        map.put("key4", 3);
        map.put("key5", null);
        map.put(null, 3);

        for (String key : getKeysJava8(map, 3)) {
            System.out.println(key);
        }

    }

    private static Set<String> getKeysJava8(
            Map<String, Integer> map, Integer value) {

        return map
                .entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

    }

}
