class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum of 2 numbers: " + math.add(5, 10));
        System.out.println("Sum of 3 numbers: " + math.add(5, 10, 15));
    }
}