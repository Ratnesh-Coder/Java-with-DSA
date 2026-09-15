import java.util.*;
public class ClassesAndMethods {
    public static void main (String[] args) {

        ChooseOptions opt = new ChooseOptions();
        int option = opt.Options();

        InputHandler input = new InputHandler();

        switch (option) {
            case 1 -> {
                int[] numbers = input.getNumbers();
                SumCalculator calculator = new SumCalculator();
                System.out.println("Sum = " + calculator.CalculateSum(numbers));
            }
            case 2 -> {
                int[] numbers = input.getNumbers();
                AverageCalculator average = new AverageCalculator();
                System.err.printf("Average = %.2f", average.CalculateAvg(numbers));
            }
            case 3 -> {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter side of square: ");
                int side = sc.nextInt();

                SquareAreaCalculator square = new SquareAreaCalculator();
                System.out.println("Area of square = " + square.SquareArea(side));
            }
            default -> System.err.println("Invalid option!");
        }
    }
}
class ChooseOptions {
    int Options() {
        Scanner sc = new Scanner(System.in);
        System.err.println("1. Sum\n2. Average\n3. Area of square");
        System.out.print("Choose an option: ");
        int opt = sc.nextInt();
        return opt;
    }
}
class InputHandler {
    int[] getNumbers() {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the total number of elements: ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }    
}
class SumCalculator {
    int CalculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
class AverageCalculator {
    float CalculateAvg(int[] numbers) {
    float sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
class SquareAreaCalculator {
    float SquareArea(int side) {
        return side * side;
    }
}