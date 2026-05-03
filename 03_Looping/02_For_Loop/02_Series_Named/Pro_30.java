import java.util.Scanner;
public class Pro_30 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            for(int m = 1;m <= n;m++){
                for(int i = 1;i <= m;i++){
                    System.out.print(m + " ");
                }
                System.out.println();
            }
            
        }
    }
}