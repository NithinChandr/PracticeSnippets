import java.util.HashSet;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Grapes");
        set.add("Orange");

        System.out.println("Elements in the HashSet: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
