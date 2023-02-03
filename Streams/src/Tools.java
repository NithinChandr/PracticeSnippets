import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tools {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "angular");
        List<String> result = getFilterOutput(lines, "angular");
        for (String temp : result) {
            System.out.println(temp);
        }
    }
    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"angular".equals(line)) {
                result.add(line);
            }
        }
        return result;
    }
}
