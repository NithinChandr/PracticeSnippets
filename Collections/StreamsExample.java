package Collections;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {

        List<Integer> listName = Arrays.asList(10, 20, 30, 40);

        for(int i =0; i< listName.size(); i++){
            System.out.println(i);
        }

        for (Integer i: listName) {
            System.out.println(i/10);
        }

    }
}
