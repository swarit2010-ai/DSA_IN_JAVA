import java.util.Scanner;
public class Pro_01{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int cp = n;
            int no_of_d = 0;
            int sum = 0,d;
            double p;
            while (n != 0){
                no_of_d ++;
                n /= 10;
            }
            n = cp;
            while(n != 0){
                d = n % 10;
                p = Math.pow(d,no_of_d);
                sum += p;
                n /= 10;
            }
            if(sum == cp){
                System.out.println("The number is an armstrong number");
            }
            else{
                System.out.println("The number is not an armstrong number");
            }
        }
    }
}