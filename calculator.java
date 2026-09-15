import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Options opt = new Options();
        int choice = opt.Choices();
        InputHandler input = new InputHandler();
        int[] numbers = input.getInput();
        switch (choice) {
            case 1 -> {
                Addition add = new Addition();
                System.out.println("Sum = " + add.CalculateSum(numbers));
            }
            case 2 -> {
                Subtraction sub = new Subtraction();
                System.out.println("Difference = " + sub.CalculateDiff(numbers));
            }
            case 3 -> {
                Multiplication multiply = new Multiplication();
                System.out.println("Product = " + multiply.CalculateProduct(numbers));
            }
            case 4 -> {
                Division div = new Division();
                System.out.println("Quotient = " + div.CalculateDivision(numbers));
            }
            case 5 -> {
                Remainder rem = new Remainder();
                System.out.println("Remainder = " + rem.CalculateRemainder(numbers));
            }
            default -> {
                System.out.println("Invalid input! Please choose from the given options.");
            }
        }
    }
}
class Options {
    int Choices() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder");
        System.out.print("Choose an option: ");
        int opt = sc.nextInt();
        return opt;
    }
}
class InputHandler {
    int[] getInput() {
        Scanner sc =  new Scanner(System.in);
        System.err.print("Enter number of elements: ");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter elements: ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
}
class Addition {
    int sum = 0;
    float CalculateSum(int[] numbers) {
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
class Subtraction {
    float CalculateDiff(int[] numbers) {
        int diff = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            diff -= numbers[i];
        }
        return diff;
    }
}
class Multiplication {
    float CalculateProduct(int[] numbers) {
        int prod = 1;
        for (int num : numbers) {
            prod *= num;
        }
        return prod;
    }
}
class Division {
    float CalculateDivision(int[] numbers) {
        int div = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("Division by zero is not possible!");
                return 0;
            }
            else {
                div /= numbers[i];
            }
        }
        return div;
    }
}
class Remainder {
    float CalculateRemainder(int[] numbers) {
        int rem = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            rem %= numbers[i];
        }
        return rem;
    }
}    