public class Pro_27 {

    public static void main(String[] args) {
        int x = 1, y = 2;
        for(int i = 1; i <= 3; i++) {
            x += y;
            for(int j = 1; j <= i; j++) {
                y += x;
                System.out.print(x + ":" + y + " ");
            }
            System.out.println();
        }
    }
}