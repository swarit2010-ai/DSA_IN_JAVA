import java.util.Scanner;
public class Pro_11 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int f = 1;
            for(int m = 1;m <= n;m++){
                f *= m;
                System.out.println(f);
            }
        }
    }
}