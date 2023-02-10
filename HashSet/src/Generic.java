import java.util.*;

public class Generic {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Nithin");
        map.put(101,"Chandra");
        map.put(102,"Patnam");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
