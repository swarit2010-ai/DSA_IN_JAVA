import java.util.Scanner;
public class Pro_02{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println("--- MENU ---");
            System.out.println("1. Find Maximum");
            System.out.println("2. Find Minimum");
            System.out.println("3. Power (a^b)");
            System.out.println("4. Average");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Maximum: " + Math.max(a, b));
                case 2 -> System.out.println("Minimum: " + Math.min(a, b));
                case 3 -> System.out.println("Power: " + Math.pow(a, b));
                case 4 -> System.out.println("Average: " + (a + b) / 2.0);
                default -> System.out.println("Error: Invalid choice!");
            }
        }
    }
}