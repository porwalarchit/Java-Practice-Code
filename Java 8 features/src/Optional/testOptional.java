package Optional;
import java.util.Optional;

public class testOptional {

    public static void main(String[] args) {
        testOptional obj = new testOptional();
        Integer value1 = null;
        Integer value2 = 10;

        //Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);

        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);
        System.out.println("Sum of 2 numbers: " + obj.sum(a,b));

        System.out.println("HashCode of a: " + a.hashCode());
        System.out.println("HashCode of b: " + b.hashCode());
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        //Optional.isPresent - checks the value is present or not

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(0);

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();

        return value1 + value2;
    }
}