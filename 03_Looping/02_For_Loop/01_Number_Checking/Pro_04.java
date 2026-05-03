import java.util.Scanner;
public class Pro_04 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number :");
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 1;i <= n;i++){
                if(n % i == 0 && i != n)
                    sum += i;
            }
            if(sum > n)
                System.out.println("It is a abundant number");
            else
                System.out.println("It is not a abundant number");
        }
    }
}