import java.util.Random;
import java.util.Scanner;

class SquareCalculator extends Thread {
    int number;

    SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square: " + (number * number));
    }
}

class CubeCalculator extends Thread {
    int number;

    CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube: " + (number * number * number));
    }
}

class RandomNumberGenerator extends Thread {
    public void run() {
        Random r = new Random();

        for (int i = 0; i < 3; i++) {
            int number = r.nextInt(10) + 1;
            System.out.println("Generated: " + number);

            if (number % 2 == 0) {
                SquareCalculator s = new SquareCalculator(number);
                s.start();
            } else {
                CubeCalculator c = new CubeCalculator(number);
                c.start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Start Simulation");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                RandomNumberGenerator r = new RandomNumberGenerator();
                r.start();
                try {
                    r.join();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            } else if (choice == 2) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}