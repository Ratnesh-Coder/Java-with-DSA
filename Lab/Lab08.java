import java.io.*;

class M {
    void method() throws IOException {
        throw new IOException("device error");
    }
}

public class Lab08 {

    // Example of throw
    public static void validate(int age) {
        if(age < 18) {
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String args[]) {

        // Example of throws
        try {
            M m = new M();
            m.method();
        }
        catch(Exception e) {
            System.out.println("Exception handled");
        }

        System.out.println("normal flow...");

        // Example of throw
        validate(13);

        System.out.println("rest of the code...");
    }
}