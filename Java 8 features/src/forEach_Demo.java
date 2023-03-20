import java.util.Stack;
import java.util.*;

public class forEach_Demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 6; i++) {
            stack.push(i * i);
        }

        System.out.print("Elements in Stack are: [ ");;

        stack.forEach(st->{
            System.out.print(st+ " ");
        });

        System.out.println("]");
    }
}
