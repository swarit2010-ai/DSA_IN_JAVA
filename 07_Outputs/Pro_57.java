public class Pro_57 {
    public static void main(String[] args) {
        int m = 10, n = 20;
        while (m++ < --n) {
            m += 2;
            n -= 1;
        }
        System.out.println(m);
        System.out.println(n);
    }
}