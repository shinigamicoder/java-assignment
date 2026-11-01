class Student {

    static int count = 0;

    Student() {
        count++;
    }

    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Student.displayCount();
    }
}