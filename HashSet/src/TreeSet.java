import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {

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
