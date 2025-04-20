public class inches_to_meters {
    public static void main (String args[]) {
        System.out.println("Inches to meters conversion:");
        int inch, counter=0;
        for (inch=1; inch<=144; inch++) {
            double inchTometer = 1 / 39.37;
            System.out.println(inch + " inch = " + inchTometer * inch);
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}