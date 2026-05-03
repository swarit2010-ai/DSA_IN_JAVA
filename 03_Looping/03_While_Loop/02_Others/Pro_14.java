import java.util.Scanner;
public class Pro_14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,rev = 0;
            while(n != 0){
                d = n % 10;
                rev = rev*10+d;
                n /= 10;
            }
            System.out.println("The reverse of the number is " + rev);
        }
    }
}
