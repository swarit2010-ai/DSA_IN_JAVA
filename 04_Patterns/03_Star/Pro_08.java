public class Pro_08 {
    public static void main(String[] args) {
        int n = 1;
        for(int i = 1;i <= 4;i++){
            for(int a = i;a <= 3;a++)
                System.out.print(" ");
            for(int b = 1;b <= n;b++){
                if(b == 1 || i == 4 || b == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            n += 2;
            System.out.println();
        }
    }
}
