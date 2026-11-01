class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

    void display(String type) {
        System.out.println(type + ": Name=" + name + ", Age=" + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.display("Default Constructor");

        Student student2 = new Student("John", 20);
        student2.display("Parameterized Constructor");

        Student student3 = new Student(student2);
        student3.display("Copy Constructor");
    }
}