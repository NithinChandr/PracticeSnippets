import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {


    public static void main(String[] args) {
        List<Developer> listDevs = getDevelopers();
        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
        System.out.println("After Sort");
        listDevs.sort(Comparator.comparingInt(Developer::getAge));
        listDevs.forEach(System.out::println);
    }

    private static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<Developer>();
        result.add(new Developer("jack", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));
        return result;

    }

}

