import java.util.*;
public class num_guess_game {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.println("\t" + "*****Number Guessing Game*****");
            int org = 10;
            System.out.println("I'm hinking of a number from 0 and 100.");
            System.out.println("Can you guess it: ");
            for (int i=0; i!=org; i++) {
                System.out.print("Guess the number: ");
                int guess = sc.nextInt();
            if (guess == org) {
                System.out.println("***Corrrect guess!");
                break;
            }
            else if (guess > org) {
                System.out.println("Too high guess! Try again.");
            }
            else {
                System.out.println("Too low guess! Try again.");
            }
            }
        }
        finally {
            sc.close();
        }
    }
}