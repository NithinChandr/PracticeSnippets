import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Intermediate {
    public static void main(String[] args)
    {
        Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        Stream<Integer> streamOfNumbers = Arrays.stream(numbers);
        Stream<Integer> evenNumbersStream = streamOfNumbers.filter(number -> number % 2 == 0);
    }
}
