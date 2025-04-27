import java.util.*;
public class shortest_path {
    public static double distance (String path) {
        int x = 0; 
        int y=0;
        for (int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N'){
                y++;
            }
            else if (dir == 'E') {
                x++;
            }
            else if (dir == 'S') {
                y--;
            }
            else {
                x--;
            }
        }
        return Math.sqrt((x*x) + (y*y));
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            String path = "NEWS";
            System.out.println("The Euclidean distance from (0, 0) is: " + distance(path));
        }
        finally {
            sc.close();
        }
    }
}
