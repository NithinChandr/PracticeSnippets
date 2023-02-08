import java.util.ArrayList;
import java.util.List;

public class Interface {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("List elements: " + numbers);

        System.out.println("Second element: " + numbers.get(1));

        numbers.remove(1);

        System.out.println("List elements after removal: " + numbers);

        System.out.println("Is 30 present in the list? " + numbers.contains(30));

        System.out.println("Size of the list: " + numbers.size());
    }
}
