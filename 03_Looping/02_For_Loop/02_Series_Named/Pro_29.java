import java.util.Scanner;
public class Pro_29 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int a = 2;
            for(int i = 1;i <= n;i++){
                System.out.println(a);
                if(i % 2 == 1)
                    a *= 2;
                else
                    a = a*2 + 1;
            }
        }
    }
}