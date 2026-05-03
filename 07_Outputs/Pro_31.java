public class Pro_31 {

    public static void main(String[] args) {
        int x = 2, y = 1;
        for(int i = 1; i <= 3; i++) {
            y *= x;
            for(int j = 1; j <= i; j++) {
                x += y;
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}