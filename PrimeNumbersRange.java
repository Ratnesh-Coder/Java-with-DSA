public class PrimeNumbersRange {
    public static void main(String[] args) {
        int m = 20;
        int n = 60;
        for (int i = m; i <= n; i++) {
            boolean isPrime = true;
            for (int j = m; j <=Math.sqrt(i); j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }
    }
}