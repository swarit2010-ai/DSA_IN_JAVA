public class Pro_32 {

    public static void main(String[] args) {
        int num = 0, k = 1;
        for(int i = 1; i <= 3; i++) {
            num = num * 10 + i;
            for(int j = 1; j <= i; j++) {
                k += num;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}