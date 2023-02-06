//Write a Java 8 program to find the number of Strings in a list whose length is greater than 5?

import java.util.Arrays;
import java.util.List;


public class Greater {
    public static void main(String[] args) {
        List<String> list = Arrays.asList( "hello", "world", "foo", "bar", "baz");

        long count = list.stream()
                .filter(s -> s.length() > 5)
                .count();

        System.out.println("Number of strings with length greater than 5: " + count);
    }
}
