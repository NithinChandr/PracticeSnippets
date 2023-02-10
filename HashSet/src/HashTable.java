import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("John Doe", 30);
        hashtable.put("Jane Doe", 25);
        hashtable.put("Jim Smith", 35);

        System.out.println("John Doe's age: " + hashtable.get("John Doe"));

        System.out.println("Is 'Jim Brown' present in the hashtable? " + hashtable.containsKey("Jim Brown"));

        hashtable.remove("Jim Smith");

        System.out.println("Size of the hashtable: " + hashtable.size());

        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            Integer value = hashtable.get(key);
            System.out.println(key + ": " + value);
        }
    }

}
