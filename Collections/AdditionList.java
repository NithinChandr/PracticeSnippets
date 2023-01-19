package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdditionList {

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5);
        List<Integer> result = new ArrayList<>();
        for (Integer integer : integerList) {
            result.add(integer+ 2);
        }
        System.out.println(result);

    }
}
