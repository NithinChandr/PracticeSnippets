import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Primitive {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.forEach(x -> System.out.println(x));
        Stream<int[]> temp = Stream.of(intArray);
        IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
        intStream2.forEach(x -> System.out.println(x));

    }

}
