import java.util.*;
import java.util.stream.*;

public class ArrayList {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 15, 18, 94, 25, 89, 48, 23, 51);
        int max = myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
    }
}



