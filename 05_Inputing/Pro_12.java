import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0;
            System.out.println("Enter 25 numbers:");
            for (int i = 1; i <= 25; i++) {
                double n = sc.nextDouble();
                if (n >= 0) {
                    double root = Math.sqrt(n);
                    if (root == (int)root) count++;
                }
            }
            System.out.println("Count of perfect squares: " + count);
        }
    }
}