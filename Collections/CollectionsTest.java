package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CollectionsTest {

    //1. Create List of String - add values into the list and print all contents of the list
    //2. Create HashMap of Integer and Integer , add values to the hashmap and print contents of the HashMap

    public static void main(String[] args) {

        List<String> carDetails = new ArrayList<>();
        carDetails.add("BMW");
        carDetails.add("Toyota");
        carDetails.add("Honda");
        carDetails.add("Audi");
        carDetails.add("Benz");
        for (int i = 0; i<carDetails.size();i++){
            System.out.println(carDetails.get(i));
        }

        HashMap<Integer,Integer> carPrice = new HashMap<>();
        carPrice.put(1,25000);
        carPrice.put(2,25000);
        carPrice.put(3,35000);
        carPrice.put(4,45000);
        System.out.println(carPrice);

    }
}
