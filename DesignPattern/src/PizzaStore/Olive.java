package PizzaStore;

class Olive extends Customization{
    Olive(Pizza pizza){
        this.pizza = pizza;
    }

    int getPrice() {
        return pizza.getPrice() + 55;
    }

    String getName() {
        return pizza.getName() + " with olive";
    }
}
