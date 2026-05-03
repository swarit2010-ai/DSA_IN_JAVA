public class Pro_24 {

    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            int x = i;
            for(int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x += i;
            }
            System.out.println();
        }
    }
}