import java.util.*;
public class square_area {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
            System.out.print("Enter side of square: ");
            int side = sc.nextInt();
            sc.close();
            System.out.print("Area: ");
            System.out.print(side*side);
    }
}