import java.util.*;
public class function_average {
    public static double average (double eng, double sci, double math) {
        double average = (eng + sci + math) / 3;
        return average;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter marks obtained in English: ");
            double eng = sc.nextDouble();
            System.out.print("Enter marks obtained in Science: ");
            double sci = sc.nextDouble();
            System.out.print("Enter marks obtained in Mathematics: ");
            double math = sc.nextDouble();
            System.out.println("Average: " + average(eng, sci, math));
        }
        finally {
            sc.close();
        }
    }
}