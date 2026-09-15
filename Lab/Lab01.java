public class Lab01 {
    public static void main(String[] args) {

        helloWorld hw = new helloWorld();
        hw.print();

        StudentsDetails s1 = new StudentsDetails();
        s1.name = "Ratnesh Kumar Ratnakar";
        s1.age = 20;
        s1.displayDetails();

        BooksDetails b1 = new BooksDetails();
        b1.title = "Java Basics";
        b1.author = "John Doe";
        b1.price = 299.99;
        b1.displayDetails();
    }
}

class helloWorld {
    void print() {
        System.out.println("Hello, World!");
    }
}

class StudentsDetails {
    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class BooksDetails {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}