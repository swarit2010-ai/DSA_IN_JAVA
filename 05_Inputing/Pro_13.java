import java.util.Scanner;
public class Pro_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 25 integers:");
            for (int i = 1; i <= 25; i++) {
                int n = Math.abs(sc.nextInt());
                int sum = 0;
                while (n > 0) {
                    sum += (n % 10);
                    n /= 10;
                }
                System.out.println("Sum of digits for this number: " + sum);
            }
        }
    }
}