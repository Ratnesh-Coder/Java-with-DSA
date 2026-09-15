public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("You cannot divide a number by zero");
        }
        finally {
            System.out.println("This block will always be executed");
        }
        System.out.println("This line will be executed after the try-catch block");
    }
}