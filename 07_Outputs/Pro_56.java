public class Pro_56 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i -= 2) {
            int k = i;
            while (k < 5) {
                System.out.print(k);
                k += 2;
            }
            System.out.println(i);
        }
    }
}