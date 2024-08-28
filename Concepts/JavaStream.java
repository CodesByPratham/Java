package Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Stream API to filter even numbers and double them
        List<Integer> evenDoubled = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(evenDoubled); // Output: [4, 8, 12, 16, 20]
    }
}
