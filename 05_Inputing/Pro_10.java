import java.util.Scanner;
public class Pro_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double sum = 0;
            int count = 0;
            System.out.println("Enter 25 numbers:");
            for (int i = 1; i <= 25; i++) {
                double n = sc.nextDouble();
                if (n > 100) {
                    sum += n;
                    count++;
                }
            }
            if (count > 0) System.out.println("Average of numbers > 100: " + (sum / count));
            else System.out.println("No numbers greater than 100 were entered.");
        }
    }
}