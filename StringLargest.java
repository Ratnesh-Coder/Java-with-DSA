public class StringLargest {
    public static String largestString (String[] fruits) {
        String largest = fruits[0];
        for (String fruit: fruits) {
            if (largest.compareToIgnoreCase(fruit) < 0) {
                largest = fruit;
            }
        }
        return largest;
    } 
    public static void main (String argds[]) {
        String[] fruits = {"apple", "banana", "mango"};
        System.out.println(largestString(fruits));
    }
}