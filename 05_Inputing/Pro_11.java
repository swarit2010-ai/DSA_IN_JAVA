import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 25 numbers:");
            double first = sc.nextDouble();
            double max = first, min = first;
            for (int i = 2; i <= 25; i++) {
                double n = sc.nextDouble();
                if (n > max) max = n;
                if (n < min) min = n;
            }
            System.out.println("The Range is: " + (max - min));
        }
    }
}