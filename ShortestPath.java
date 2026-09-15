public class ShortestPath {
    public static double distance (String path) {
        int x = 0; 
        int y=0;
        for (int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'N' -> y++;
                case 'E' -> x++;
                case 'S' -> y--;
                case 'W' -> x--;
                default -> System.out.print("Invalid direction: " + dir);
            }
        }
        return Math.sqrt((x*x) + (y*y));
    }
    public static void main (String args[]) {
        String path = "NEWS";
        System.out.println("The Euclidean distance from (0, 0) is: " + distance(path));
    }
}
