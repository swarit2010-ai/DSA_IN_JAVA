import java.util.Scanner;
public class Pro_08{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,sum = 0,cp = n;
            while(n != 0){
                d = n % 10;
                sum += d;
                n /= 10;
            }
            n = cp;
            if(n % sum == 0){
                System.out.println("The number is a harshad number");
            }
            else{
                System.out.println("The number is not a harshad number");
            }
        }
    }
}