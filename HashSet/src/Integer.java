import java.util.HashMap;

public class Integer {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Key1", 1);
        map.put("Key2", 2);

        Integer value1 = map.get("Key1");
        Integer value2 = map.get("Key2");

        System.out.println("Value associated with Key1: " + value1);
        System.out.println("Value associated with Key2: " + value2);
    }
}
