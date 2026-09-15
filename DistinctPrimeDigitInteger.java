public class DistinctPrimeDigitInteger {
    public static void main(String[] args) {

        int m = 20;
        int n = 60;

        for (int i = m; i <= n; i++) {

            int temp = i;
            boolean isValid = true;
            boolean[] used = new boolean[10];

            while (temp > 0) {

                int rem = temp % 10;
                boolean isPrime = true;

                if (rem < 2) {
                    isPrime = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(rem); j++) {
                        if (rem % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (!isPrime || used[rem]) {
                    isValid = false;
                    break;
                }

                used[rem] = true;
                temp /= 10;
            }

            if (isValid) {
                System.out.println(i + " ");
            }
        }
    }
}
