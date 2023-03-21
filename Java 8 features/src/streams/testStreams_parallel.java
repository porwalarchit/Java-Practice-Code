package streams;

import java.util.Arrays;
import java.util.List;

public class testStreams_parallel {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        //get count of empty string
        long count = strings.parallelStream().filter(String::isEmpty).count();
        System.out.println(count);

    }

}
