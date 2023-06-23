package PizzaStore;

class ChickenChunks extends Customization{
    ChickenChunks(Pizza pizza){
        this.pizza = pizza;
    }

    int getPrice() {
        return pizza.getPrice() + 65;
    }

    String getName() {
        return pizza.getName() + " with chicken chunks";
    }
}
