import java.util.Scanner;
public class Pro_06{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,sum = 0,pro = 1;
            while(n != 0){
                d = n % 10;
                sum += d;
                pro *= d;
                n /= 10;
            }           
            if(sum == pro){
                System.out.println("The number is a spy number");
            }  
            else{
                System.out.println("The number is not a spy number");
            }
        }
    }
}