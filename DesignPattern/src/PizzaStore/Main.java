package PizzaStore;

public class Main {
    public static void main(String[] args) {
        Pizza thinCrustPizza = new ThinCrust();
        thinCrustPizza = new Cheese(thinCrustPizza);
        thinCrustPizza = new Olive(thinCrustPizza);
        thinCrustPizza = new ChickenChunks(thinCrustPizza);
        System.out.println(thinCrustPizza.getName());
        System.out.println("Total Amount: " + thinCrustPizza.getPrice());

        Pizza regularPizza = new Regular();
        regularPizza = new ChickenChunks(regularPizza);
        regularPizza = new Cheese(regularPizza);
        System.out.println(regularPizza.getName());
        System.out.println("Total Amount: " + regularPizza.getPrice());
    }
}
