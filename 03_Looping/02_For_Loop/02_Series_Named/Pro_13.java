import java.util.Scanner;
public class Pro_13 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int a;
            int b = 0;
            int f = 1;
            for(int m = 1;m <= n;m++){
                System.out.println(f - b);
                a = b;
                b = f;
                f = a+b;
            }
        }
    }
}