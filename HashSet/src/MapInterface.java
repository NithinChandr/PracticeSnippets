import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class MapInterface {
    public static void main(String args[])
    {
        Map<String, Integer> map = new HashMap<>();

        map.put("a", new java.lang.Integer(100));
        map.put("b", new java.lang.Integer(200));
        map.put("c", new java.lang.Integer(300));
        map.put("d", new java.lang.Integer(400));

        for (Map.Entry<String, Integer> e : map.entrySet());
        System.out.println(e.getKey() + " "
                + e.getValue());


    }

}
