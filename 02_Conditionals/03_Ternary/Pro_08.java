import java.util.Scanner;
public class Pro_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter coefficients a, b, and c:");
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            double d = (b * b) - (4 * a * c);
            String nature = (d > 0) ? "Real and Distinct" : (d == 0) ? "Real and Equal" : "Imaginary";
            System.out.println("Roots are " + nature);
        }
    }
}