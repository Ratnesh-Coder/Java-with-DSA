import java.util.Scanner;
public class Lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Code - 01
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        System.out.println("Length of " + "'" + str + "'" + " is " + str.length());
        System.out.println("Upper case: " + str.toUpperCase());
        System.out.println("Lower case: " + str.toLowerCase());

        // Code - 02
        System.out.println("Reversed: " + new StringBuilder(str).reverse().toString());
        System.out.println("First character: " + str.charAt(0));

        System.out.println("Substring between 5 - 16: " + str.substring(5, 16));
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Contains 'pain' : " + str.contains("pain"));

        // Write a Java program to demonstrate the use of StringBuffer methods such as append, insert, replace, delete and reverse.
        // Code - 03
        StringBuffer sb = new StringBuffer("Hello,");
        sb.append(" World!");
        System.out.println("After append: " + sb);

        sb.insert(6, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(7, 11, "Python");
        System.out.println("After replace: " + sb);

        sb.delete(7, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Code - 04
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        String str4 = str1 + " Programming";
        System.out.println("Concatenated string: " + str4);
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));

        // Code - 05
        Book b1 = new Book("Java Basics", 299.99);
        Book b2 = new Book("Advanced Java", 399.99);
        b1.display();
        b2.display();
    }
}

// Code 05
class Book {
    String title;
    double price;
    Book(String t, double p) {
        title = t;
        price = p;
    }
    void display() {
        System.out.println("Title: " + title + ", Price: $" + price);
    }
}
