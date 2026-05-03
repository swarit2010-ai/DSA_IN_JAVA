public class Pro_26 {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        for(int i = 1; i <= 3; i++) {
            int t = a;
            a = b;
            b = c;
            c = t + i;
            System.out.print(a + " " + b + " " + c + " | ");
        }
    }
}