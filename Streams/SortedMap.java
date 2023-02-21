import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap {
    public static void main(String[] args) {
        SortedMap<String,Integer> scores = new TreeMap<>();
        scores.put("Nithin",97);
        scores.put("Chandra",23);
        scores.put("Patnam",22);
        scores.put("Sekhar"01);

        for(StringName: scores.Keyset()){
            System.out.println(name +"." + scores.get(name));
        }

        String Firstkey = scores.firstkey();
        String Lastkey = scores.lastkey();

        SortedMap<String, Integer> range = scores.subMap("Nithin","Chandra",);

        for(StringName: range.keySet()){
            System.out.println(name + " : " + range.get(name));
        }

    }
}
