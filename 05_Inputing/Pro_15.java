import java.util.Scanner;
public class Pro_15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double product = 1;
            boolean hasPositive = false;
            System.out.println("Enter 25 numbers:");
            for (int i = 1; i <= 25; i++) {
                double n = sc.nextDouble();
                if (n > 0) {
                    product *= n;
                    hasPositive = true;
                }
            }
            if (hasPositive) System.out.println("Product of positives: " + product);
            else System.out.println("No positive numbers were entered.");
        }
    }
}