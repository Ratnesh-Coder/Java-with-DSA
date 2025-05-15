public class string_occurrence {
    public static int occurrence (String word) {
        
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter a word: ");
            String word = sc.next();
        }
        finally {
            sc.close();
        }
    }
}