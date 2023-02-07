import java.util.TreeSet;

public class TreeExample {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(4);

        System.out.println("Elements in the set: " + set);
        System.out.println("Does the set contain 2? " + set.contains(2));
        set.remove(3);
        System.out.println("Elements in the set after removing 3: " + set);
        System.out.println("First element in the set: " + set.first());
        System.out.println("Last element in the set: " + set.last());
    }
}
