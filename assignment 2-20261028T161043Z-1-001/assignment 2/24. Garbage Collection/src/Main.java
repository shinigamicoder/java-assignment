class Demo {

    @Override
    protected void finalize() {
        System.out.println("Object destroyed");
    }
}

public class Main {
    public static void main(String[] args) {

        Demo obj = new Demo();

        obj = null;

        System.gc();
    }
}