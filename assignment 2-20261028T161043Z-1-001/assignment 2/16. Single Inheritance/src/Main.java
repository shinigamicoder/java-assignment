class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    String empId;
    double salary;

    Employee(String name, int age, String empId, double salary) {
        super(name, age);
        this.empId = empId;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Alice", 30, "E123", 50000);

        employee.displayEmployeeDetails();
    }
}