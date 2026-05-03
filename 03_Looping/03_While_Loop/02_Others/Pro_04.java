import java.util.Scanner;
public class Pro_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int sq,d;
            while(n != 0){
                d = n%10;
                sq = d*d;
                System.out.println("The square of the digit " + d + " is " + sq);            
                n /= 10;
            }
        }
    }
}