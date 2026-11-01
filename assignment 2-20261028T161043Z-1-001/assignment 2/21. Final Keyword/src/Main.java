class Parent {

    final void display() {
        System.out.println("This is a final method.");
    }
}

final class FinalClass {

    void show() {
        System.out.println("This is a final class.");
    }
}

public class Main {
    public static void main(String[] args) {

        final int value = 100;

        System.out.println("Final variable value: " + value);

        System.out.println("Cannot inherit from final class");

        System.out.println("Cannot override final method");
    }
}