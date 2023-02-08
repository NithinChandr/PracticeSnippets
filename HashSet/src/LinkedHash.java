import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Durian");

        System.out.println("Elements in the set: " + set);
        System.out.println("Is Grape in the set? " + set.contains("Grape"));
        System.out.println("Is Durian in the set? " + set.contains("Durian"));
        set.remove("Durian");
        System.out.println("Elements in the set after removing Durian: " + set);
        System.out.println("Size of the set: " + set.size());
    }

}
