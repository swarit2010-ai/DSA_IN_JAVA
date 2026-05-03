import java.util.Scanner;
public class Pro_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,c;
            while(n != 0){
                d = n % 10;
                c = d*d*d;
                System.out.println("The cube of the digit " + d + " is " + c);
                n /= 10;
            }
        }
    }
}