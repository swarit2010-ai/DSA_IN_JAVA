public class Pro_30 {

    public static void main(String[] args) {
        int a = 1, b = 2;
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 2; j++) {
                a += i + j;
                b += a;
                System.out.print(a + "-" + b + " ");
            }
            System.out.println();
        }
    }
}