import java.util.*;
public class Lab02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello, " + name + "! You am " + age + " years old.");
    }
}