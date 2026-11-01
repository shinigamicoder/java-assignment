abstract class Payment {

    abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
        System.out.println("Credit card payment successful");
    }
}

class UPIPayment extends Payment {

    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of " + amount);
        System.out.println("UPI payment successful");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPIPayment();

        creditCard.processPayment(500);
        upi.processPayment(300);
    }
}