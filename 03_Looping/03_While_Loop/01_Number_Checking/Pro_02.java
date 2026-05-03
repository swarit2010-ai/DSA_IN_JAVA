import java.util.Scanner;
public class Pro_02{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int r = 0,d;
            int cp = n;
            while(n != 0){
                d = n % 10;
                r = r * 10 + d;
                n /= 10;
            }
            if(cp == r){
                System.out.println("The number is a palindrome number");
            }
            else{
                System.out.println("The number is not a palindrome number");
            }
        }
    }
}