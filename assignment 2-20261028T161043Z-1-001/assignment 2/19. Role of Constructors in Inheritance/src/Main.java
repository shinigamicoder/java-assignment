class Base {

    Base() {
        System.out.println("Base Constructor Called");
    }
}

class Derived extends Base {

    Derived() {
        System.out.println("Derived Constructor Called");
    }
}

public class Main {
    public static void main(String[] args) {

        Derived obj = new Derived();
    }
}