import java.util.HashMap;
import java.util.Map;

public class Node {
    public static void main(String[] args){

        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("A", 1);
        hashmap.put("B", 2);
        hashmap.put("C", 3);
        System.out.println("HashMap: " + hashmap);
        System.out.println("Value for key 'B': " + hashmap.get("B"));
        hashmap.remove("B");
        System.out.println("HashMap after removing key 'B': " + hashmap);
    }
}



