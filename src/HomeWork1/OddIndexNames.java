package HomeWork1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndexNames {
    public static String formatOddIndexNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = List.of(
                "1. Ivan",
                "2. Petro",
                "3. Alex",
                "4. Jane",
                "5. Igor",
                "6. Sergiy",
                "7. Anna",
                "8. Olga",
                "9. Johan",
                "10. Sophia"
        );

        String formattedNames = formatOddIndexNames(names);
        System.out.println(formattedNames);
    }
}
