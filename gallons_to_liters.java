public class gallons_to_liters {
    public static void main (String args[]) {
        double gallons, liters;
        int counter = 0; 
        for (gallons=0; gallons<=100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters");
            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}