import java.util.Scanner;
public class Pro_15 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int p = 1;
            for(int m = 1;m <= n;m++){
                for(int j = 1;j <= m;j++){
                    p *= m;
                }
                System.out.println(p);
                p = 1;
            }
        }
    }
}