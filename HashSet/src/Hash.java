import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();


        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Jim", 35);

        System.out.println("Elements in the map: " + map);
        System.out.println("Does the map contain the key 'Jane'? " + map.containsKey("Jane"));
        System.out.println("Value for key 'Jim': " + map.get("Jim"));

        map.remove("John");
        System.out.println("Elements in the map after removing 'John': " + map);
        System.out.println("Is the map empty? " + map.isEmpty());
    }
}
