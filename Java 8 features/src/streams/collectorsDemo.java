package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectorsDemo {
    public static void main(String[] args) {
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        //filtered String
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).toList();
        // .toList() can be used in place of .collect(Collectors.toList())
        System.out.println("Filtered List: " + filtered);

        // Merged String
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
    }
}
