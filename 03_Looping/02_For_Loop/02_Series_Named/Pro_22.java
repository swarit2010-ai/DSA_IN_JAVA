import java.util.Scanner;
public class Pro_22 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int a = 1;
            int b = 1;
            double f = 1;
            double prev_fib = 1;
            double res;
            for(int m = 1;m <= n;m++){
                res = f/prev_fib;
                System.out.println(res);
                f = a+b;
                prev_fib = b;
                a = b;
                b = (int)f;
            }
        }
    }
}
                              