import java.util.Scanner;
public class Pro_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        double f = 1;
        int j = 1;
        double div;
        double powe;
        for(int p = 1;p <= n;p++){
            for(int m = 1;m <= j;m++){
                f *= m;
            }
            powe = Math.pow(x,p);
            div = powe/f;
            System.out.println(div);  
            j += 2;     
            f = 1;
        }
    }
}