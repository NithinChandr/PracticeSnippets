import java.io.IOException;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class Doubles {
    public static void main(String[] args) throws IOException {
        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(System.out::println);

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(System.out::println);
    }
}
