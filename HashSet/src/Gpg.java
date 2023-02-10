import java.util.HashMap;
import java.util.Map;

public class Gpg {
    public static void main(String[] args) {
        // create a map
        Map<String, Integer> map = new HashMap<>();

        map.put("John Doe", 30);
        map.put("Jane Doe", 25);
        map.put("Jim Smith", 35);

        System.out.println("John Doe's age: " + map.get("John Doe"));
        System.out.println("Is 'Jim Brown' present in the map? " + map.containsKey("Jim Brown"));
        map.remove("Jim Smith");
        System.out.println("Size of the map: " + map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
