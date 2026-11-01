class Book {
    String title;
    String author;
    double price;

    void setDetails(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        book1.setDetails("Java Basics", "John Smith", 500);
        book2.setDetails("Python Essentials", "Mary John", 650);

        book1.displayDetails();
        book2.displayDetails();
    }
}