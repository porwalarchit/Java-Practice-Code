package PizzaStore;

class Cheese extends Customization{
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    int getPrice() {
        return pizza.getPrice() + 70;
    }

    String getName() {
        return pizza.getName() + " with cheese";
    }
}
