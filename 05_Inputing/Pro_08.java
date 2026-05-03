import java.util.Scanner;
public class Pro_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double sumSq = 0;
            System.out.println("Enter 25 numbers:");
            for (int i = 1; i <= 25; i++) {
                double n = sc.nextDouble();
                sumSq += (n * n);
            }
            System.out.println("Sum of squares: " + sumSq);
        }
    }
}