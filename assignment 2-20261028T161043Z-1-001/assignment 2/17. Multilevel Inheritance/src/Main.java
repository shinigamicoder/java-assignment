class Animal {
    String animalType = "Mammal";

    void displayAnimalType() {
        System.out.println("Animal Type: " + animalType);
    }
}

class Mammal extends Animal {
    void showMammal() {
        System.out.println("This is a mammal.");
    }
}

class Dog extends Mammal {
    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void displayDogDetails() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
        displayAnimalType();
    }
}

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", "Labrador");

        dog.displayDogDetails();
    }
}