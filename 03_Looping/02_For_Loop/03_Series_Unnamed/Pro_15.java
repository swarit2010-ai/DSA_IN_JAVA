import java.util.Scanner;
public class Pro_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int x = 2;
        int f = 1;
        for(int p = 1;p <= n;p++){
            for(int m = 1;m <= x;m++){
                f *= m;
            }
            System.out.println(f);
            f = 1;
            x = x+2;       
        }
    }
}