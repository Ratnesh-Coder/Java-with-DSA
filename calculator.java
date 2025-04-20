import java.util.*;
public class calculator {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        float first = sc.nextFloat();
        System.out.print("Enter second number: ");
        float second = sc.nextFloat();
        System.out.println("Press + for Addition");
        System.out.println("Press - for Subtraction");
        System.out.println("Press * for Multiplication");
        System.out.println("Press / for Division");
        System.out.print("Enter your operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+': System.out.println("Result: " + (first + second));
            break;
            case '-': System.out.println("Result: " + (first - second));
            break;
            case '*': System.out.println("Result: " + (first * second));
            break;
            case '/':
            if (second != 0) {
                System.out.println("Result: " + (first / second));
            }
            else {
                System.out.println("Error: Cannot divide by 0.");
            }
            break;
            default: System.out.println("Wrong selection! Selection from given operations.");
        }
        sc.close();
    }
}