import java.util.*;

public class Iterable_forEachDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 6; i++) {
            stack.push(i * i);
        }
//        Iterator<Integer> it = stack.iterator();
//        for(int i=0; i<10; i++){
//            System.out.println(it.next());
//        }
        System.out.println("Elements in Stack are: ");;
        stack.forEach(st->{
            System.out.println(st);
        });
    }
}
