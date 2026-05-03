import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. C to F\n2. F to C\nSelect option:");
            int op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Enter Celsius: "); double c = sc.nextDouble();
                    System.out.println("F: " + (c * 9/5 + 32));
                }
                case 2 -> {
                    System.out.print("Enter Fahrenheit: "); double f = sc.nextDouble();
                    System.out.println("C: " + ((f - 32) * 5/9));
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}