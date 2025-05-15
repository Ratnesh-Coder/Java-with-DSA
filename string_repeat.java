public class string_repeat {
    public static int[] result (String[] str1, String[] str2){
        int[] counts = new int[str2.length];
        for (int i=0; i<str1.length; i++) {
            int count = 0;
            for (int j=0; j<str2.length; j++) {
                if (str1[j] == (str2[i])) {
                    count++;
                }
            }
            counts[i] = count;
        }
        return counts;
    }
    public static void main (String args[]) {
        String[] str1 = {"abc", "abc", "bc"};
        String[] str2 = {"abc", "ab", "bc"};
        int[] result = result(str1, str2);
        for (int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}