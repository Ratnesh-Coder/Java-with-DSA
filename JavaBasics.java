// Mesasge passing refers to communication between objects using method call.
// Object are stored in heap memory.

import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        SignDetermination sign = new SignDetermination();
        System.out.println(sign.SignChecking());

        Temperature temp = new Temperature();
        System.out.println(temp.CalulateTemp());

        PrintDays days = new PrintDays();
        System.out.println(days.Days());

        LeapYear leap = new LeapYear();
        System.out.println(leap.leapYear());

        SumEvenOdd s = new SumEvenOdd();
        System.err.println(s.EvenOdd());

        FactorialCheck f = new FactorialCheck();
        System.err.println(f.Factorial());

        MultiplicationTable m = new MultiplicationTable();
        System.out.println(m.Table());
    }
}
class Temperature {
    String CalulateTemp() {
        double temp = 103.5;
        String sick = (temp > 100) ? "You have a fever." : "You don't have a fever";
        return sick;
    }
}
class SignDetermination {
    String SignChecking() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String sign = (num < 0)? num + " is a negative number" : num + " is a positive number";
        return sign;
    }
}
class PrintDays {
    String Days() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sunday";
            }
            default -> {
                return "Invalid day number! Please enter day number between 1-7.";
            }
        }
    }
}
class LeapYear {
    String leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        int year = sc.nextInt();
        String leap = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? year + " is a leap year." : year + " is not a leap year.";
        return leap;
    }
}

class SumEvenOdd {
    String EvenOdd() {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.err.print("Enter range: ");
        int range = sc.nextInt();
        for (int i = 0; i < range; i++) {
            if (i % 2 == 0) {
                even += i;
            }
            else {
                odd += i;
            }
        }
        return "Sum of Even numbers = " + even + ", Sum of Odd numbers = " + odd;

    }
}

class FactorialCheck {
    String Factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return "Factorial of " + n + " is " + fact;
    }
}

class MultiplicationTable {
    String Table() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        StringBuilder table = new StringBuilder();

        for (int i = 0; i <= 12; i++) {
            table.append(n);
            table.append(" x ");
            table.append(i);
            table.append(" = ");
            table.append(n*1);
            table.append("\n");
        }
        return table.toString();
    }
}