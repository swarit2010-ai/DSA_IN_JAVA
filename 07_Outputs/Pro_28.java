public class Pro_28 {

    public static void main(String[] args) {
        int a = 5, b = 1;
        for(int i = 3; i >= 1; i--) {
            a -= i;
            for(int j = i; j >= 1; j--) {
                b += a;
                System.out.print(a + "," + b + " ");
            }
            System.out.println();
        }
    }
}