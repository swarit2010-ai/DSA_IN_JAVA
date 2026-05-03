public class Pro_55 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        while (a < 10) {
            a *= b;
            b++;
        }
        System.out.println(a + b + " total");
        System.out.println("total " + a + b);
    }
}