abstract class Shape {

    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);

        System.out.printf("Circle Area: %.2f%n", circle.area());
        System.out.printf("Circle Perimeter: %.2f%n", circle.perimeter());

        Rectangle rectangle = new Rectangle(4, 6);

        System.out.printf("Rectangle Area: %.1f%n", rectangle.area());
        System.out.printf("Rectangle Perimeter: %.1f%n", rectangle.perimeter());
    }
}