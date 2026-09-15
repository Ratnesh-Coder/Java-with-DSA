class Bike {
    final void run() {
        System.out.println("Running....");
    }
}
class Honda extends Bike {}

class Bikee {
    final int speedLimit;
    Bikee() {
        speedLimit = 70;
        System.out.println("SpeedLimit");
    }
}

// Recursion in Java is a process in which a method calls itself continuously.
// A method in Java that calls itself is called Recursive method.
class Factorial {
    int fact(int n) {
        if (n == 0) 
            return 1;
        else {
            return n * fact(n - 1);
        }
    }
}

class InfiniteRecursion {
    void printHello() {
        System.out.println("Hello! World");
        printHello();
    }
}

class FiniteRecursion {
    int count = 0;
    void printHello(){
        if (count < 5) {
            System.out.println("Hello! World");
            count++;
            printHello();
        }
    }
}

class Recursion {
    static int count = 0;
    static void p() {
        count++;
        if(count <= 5) {
            System.out.println("count");
            p();
        }
        System.out.println(count);
    }
}

class Method {
    void overriding() {
        System.out.println("Hello, World");
    }
}
class MethodOverriding {
    void overriding() {
        System.out.println("Yo! Java");
    }
}

public class Lab06 {
    public static void main(String[] args) {
        new Honda().run();

        new Bikee();

        Factorial f = new Factorial();
        System.out.println(f.fact(5));

        InfiniteRecursion ir = new InfiniteRecursion();
        ir.printHello();

        FiniteRecursion fr = new FiniteRecursion();
        fr.printHello();

        Recursion.p();
      }
}

