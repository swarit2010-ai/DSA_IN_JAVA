import java.util.Scanner;
public class Pro_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            System.out.println("Enter the number you want to check the divisibility with :");
            int c = sc.nextInt();
            int d,f = 0;
            while (n != 0){
                d = n % 10;
                if(d % c == 0){
                    f++;
                }
                n /= 10;
            }
            System.out.println("The frequency of digits divisible by " + c + " is " + f);
        }
    }
}
