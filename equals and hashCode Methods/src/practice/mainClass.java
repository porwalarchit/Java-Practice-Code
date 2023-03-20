package practice;

import java.util.Objects;

public class mainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Archit");

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("Archit");

//        System.out.println(Objects.hash(e1.getId(), e1.getName()));
//        System.out.println(Objects.hash(e2.getId(), e2.getName()));
        // Shallow Comparison is memory comparison
        System.out.println("Shallow Comparison: " + (e1==e2));
        //Deep Comparison is done using equals() method.
        System.out.println("Deep Comparison: " + (e1.equals(e2)));
        System.out.println("In this Employee class we have not overloaded the equals() operator that's why the output will be false for both Shallow and deep comparison...");

        Employee_Overloaded e1_o = new Employee_Overloaded();
        e1.setId(1);
        e1.setName("Archit");

        Employee_Overloaded e2_o = new Employee_Overloaded();
        e2.setId(1);
        e2.setName("Archit");

//        System.out.println(Objects.hash(e1_o.getId(), e1_o.getName()));
//        System.out.println(Objects.hash(e2_o.getId(), e2_o.getName()));
        System.out.println("\nShallow Comparison: " + (e1_o==e2_o));
        System.out.println("Deep Comparison: " + (e1_o.equals(e2_o)));
        System.out.println("Now, we can that the Deep Comparison is returning true because we have overloaded the equals() operator.");

    }
}
