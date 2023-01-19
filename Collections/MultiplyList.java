package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplyList {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> ooo = new ArrayList<>();

        for (Integer i : integerList) {
            ooo.add(i*2);
        }
        System.out.println(integerList);
        System.out.println(ooo);

        List<Integer> addition = new ArrayList<>();
        for(Integer i: integerList){
            addition.add(i+2);
        }
        System.out.println(addition);

    }
}
