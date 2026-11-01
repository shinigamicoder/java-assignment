class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum (int,int): " + calc.add(3, 4));

        System.out.println("Sum (double,double): " + calc.add(2.5, 3.2));

        System.out.println("Sum (int,int,int): " + calc.add(4, 5, 6));
    }
}