import java.util.Scanner;
public class Pro_12{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int s = n*n;
            int cp = n;
            int no_of_d = 0;
            while(n != 0){
                no_of_d++;
                n /= 10;
            }
            n = cp;
            int pow = (int)Math.pow(10, no_of_d);
            int sec_half = s%pow;
            int fir_half = s/pow;
            if(fir_half + sec_half == n){
                System.out.println("The number is a kaprekar number");
            }
            else{
                System.out.println("The number is not a kaprekar number");
            }
        }
    }
}