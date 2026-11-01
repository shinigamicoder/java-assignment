interface Shape {

    default void displayShape(String shape) {
        System.out.println("Shape: " + shape);
    }

    static void showMessage() {
        System.out.println("Static method from interface");
    }
}

class Square implements Shape {
}

class Triangle implements Shape {
}

public class Main {
    public static void main(String[] args) {

        Square square = new Square();
        Triangle triangle = new Triangle();

        square.displayShape("Square");
        triangle.displayShape("Triangle");

        Shape.showMessage();
    }
}