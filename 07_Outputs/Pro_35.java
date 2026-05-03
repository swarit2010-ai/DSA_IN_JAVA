public class Pro_35 {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        for(int i = 1; i <= 3; i++) {
            a += i;
            for(int j = 1; j <= 2; j++) {
                b += a++;
                c += b--;
                System.out.print(a + ":" + b + ":" + c + " ");
            }
            System.out.println();
        }
    }
}