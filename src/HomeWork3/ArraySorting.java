package HomeWork3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraySorting {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};

        String result = Arrays.stream(array)
                .flatMap(str -> Arrays.stream(str.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
