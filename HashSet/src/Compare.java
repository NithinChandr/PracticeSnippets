import java.util.*;

public class Compare {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Nithin");
        map.put(101,"Chandra");
        map.put(102,"Patnam");


        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }

}
