import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class DataSource {


        public static void main(String[] args)
        {
            ArrayList<String> gfgNames = new ArrayList<>();
            gfgNames.add("Dean");
            gfgNames.add("casey");
            gfgNames.add("robert");
            Stream<String> streamOfNames = gfgNames.stream();
            System.out.print(streamOfNames);
        }
    }


