package streams;
import java.util.Arrays;
import java.util.List;

//Sequential Streams
public class testStreams_sequential {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).toList();
        System.out.println(filtered);

        // map
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().toList();
        System.out.println(squaresList);

        //filter
        //get count of empty string
        int count = (int) strings.stream().filter(st-> st.isEmpty()).count();
        System.out.println(count);

        //limit with forEach also filtering Empty Strings
        System.out.println("\nLimit: ");
        strings.stream().filter(string->!string.isEmpty()).limit(3).forEach(System.out::println);

        // Sort the string using streams concept, also removed empty string using filter()
        System.out.println("\nSorted String: ");
        strings.stream().filter(st->!st.isEmpty()).sorted().forEach(System.out::println);


    }

}
