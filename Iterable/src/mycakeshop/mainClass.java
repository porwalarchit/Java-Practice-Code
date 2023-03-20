package mycakeshop;
import java.lang.Iterable;
import java.util.Iterator;

public class mainClass {
    public static void main(String[] args) {
        CakeShop c = new CakeShop();
        c.addCake("vanilla Cake");
        c.addCake("Chocolate Cake");
        c.addCake("Pineapple Cake");
        c.addCake("Cheese Cake");
        c.addCake("Strawberry Cake");

        System.out.println("Printing menu using Iterator:");
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String cake = it.next();
            System.out.println(cake);
        }
    }
}
