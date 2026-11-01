class Vehicle {

    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starting...");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starting...");
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        bike.start();
    }
}