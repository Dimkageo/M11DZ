package HomeWork2;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NamesUppercaseDescending {

    public static List<String> sortAndConvertToUpperCase(List<String> strings) {
        Pattern pattern = Pattern.compile("([0-9]+)\\. (.+)");
        return strings.stream()
                .map(pattern::matcher)
                .filter(Matcher::matches)
                .sorted((s1, s2) -> {
                    String name1 = s1.group(2);
                    String name2 = s2.group(2);
                    return name2.compareToIgnoreCase(name1);
                })
                .map(matcher -> matcher.group(0).toUpperCase())
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<String> strings = List.of(
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

        List<String> sortedUpperCaseStrings = sortAndConvertToUpperCase(strings);
        System.out.println(sortedUpperCaseStrings);
    }
}
