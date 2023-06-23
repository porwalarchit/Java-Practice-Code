package PizzaStore;

class Regular extends Pizza{
    @Override
    int getPrice() {
        return 80;
    }

    @Override
    String getName() {
        return "Regular";
    }
}
