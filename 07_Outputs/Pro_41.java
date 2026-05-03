public class Pro_41 {
    public static void main(String[] args) {
        int a = 6, b = 4, k;

        for (k = a; k <= a*b; k += a) {
            if (k % b == 0)
                break;
        }
        System.out.println(k);
    }
}
