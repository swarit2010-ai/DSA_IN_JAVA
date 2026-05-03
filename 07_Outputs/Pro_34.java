public class Pro_34 {

    public static void main(String[] args) {
        int s, x = 1;
        for(int i = 1; i <= 3; i++) {
            s = 0;
            for(int j = 1; j <= i + 1; j++) {
                s += x;
                x++;
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}