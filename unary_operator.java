public class unary_operator {
    public static void main (String args[]) {
        int a = 5;
        int b = ++a;
        int c = a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int aa = 5;
        int bb = --aa;
        int cc = aa--;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
    }
}