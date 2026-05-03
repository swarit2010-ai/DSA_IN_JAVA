import java.util.Scanner;
public class Pro_02 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number :");
            int n = sc.nextInt();
            int fact = 0;
            for(int i = 1;i <= n;i++){
                if(n % i == 0)
                    fact++;
            }
            if(fact != 2)
                System.out.println("It is a composite number");
            else
                System.out.println("It is not a composite number");
        }
    }
}