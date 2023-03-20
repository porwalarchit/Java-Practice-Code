interface Car{
    public void printCar();
}

interface Train{
    public void printTrain();
        }

class Bus{
    public static void printBus(){
        System.out.println("Bus Class extended by main class.");
    }
}

class Vehicle extends Bus implements Car, Train {
    Vehicle(){
        System.out.println("Main Class: Vehicle.java");
    }
    public void printCar(){
        System.out.println("Car Interface implemented by main Class");
    }

    public void printTrain(){
        System.out.println("Train Interface implemented by main Class");
    }
    public static void main(String[] args) {
        System.out.println("Example to show Multiple Inheritance using Interface\n");
        Vehicle v = new Vehicle();
        v.printCar();
        v.printBus();
        v.printTrain();
    }
}