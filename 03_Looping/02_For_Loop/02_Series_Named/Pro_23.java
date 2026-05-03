import java.util.Scanner;
public class Pro_23 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int f;
            int c = -1;
            int d = 1;
            int fib = 0;
            while(fib <= n){
                fib = c+d;
                c = d;
                d = fib;
            }
            int a = d-c;
            int b = c;
            for(;b >= 1;){
                System.out.println(b);
                f = b-a;
                b = a;
                a = f;
            }
        }
    }
}