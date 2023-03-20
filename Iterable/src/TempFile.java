import java.util.*;
import java.lang.Iterable;

public class TempFile {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 6; i++) {
            stack.push(i * i);
        }
        // creating Iterator named iter
        Iterator<Integer> iter;
        iter = stack.iterator();
        // iterating elements of the set
        while (iter.hasNext()) {
            int nextElement = iter.next();
            System.out.print(nextElement + " ");
        }
    }
}
