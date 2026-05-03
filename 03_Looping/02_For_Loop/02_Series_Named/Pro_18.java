import java.util.Scanner;
public class Pro_18 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int a = -1;
            int b = 1;
            int f = a+b;
            for(int m = 0;m < n;m++){
                System.out.println(f*m);
                a = b;
                b = f;
                f = a+b;
            }
        }
    }
}