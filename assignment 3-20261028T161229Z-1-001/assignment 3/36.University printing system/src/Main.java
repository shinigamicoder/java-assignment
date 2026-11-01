class PrinterJob implements Runnable {
    String student;
    int jobNumber;

    PrinterJob(String student, int jobNumber) {
        this.student = student;
        this.jobNumber = jobNumber;
    }

    public void run() {
        try {
            System.out.println("Printing job " + jobNumber
                    + " by " + student);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrinterJob("Student A", 1));
        Thread t2 = new Thread(new PrinterJob("Student B", 2));
        Thread t3 = new Thread(new PrinterJob("Student C", 3));

        t1.start();
        t2.start();
        t3.start();
    }
}