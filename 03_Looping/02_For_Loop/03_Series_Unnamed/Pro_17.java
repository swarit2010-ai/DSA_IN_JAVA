import java.util.Scanner;
public class Pro_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        double f = 1;
        double res = 0;
        double div;
        double powe;
        for(int p = 1;p <= n;p++){
            for(int m = 1;m <= p;m++){
                f *= m;
            }
            powe = Math.pow(x,p);
            div = powe/f;
            if(p % 2 == 0){
                res -= div;
            }  
            else{
                res += div;
            }
            f = 1;
        }
        System.out.println(res);
    }
}