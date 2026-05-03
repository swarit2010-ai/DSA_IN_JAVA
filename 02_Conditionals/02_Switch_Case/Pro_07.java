import java.util.Scanner;
public class Pro_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. Circle\n2. Square\n3. Rectangle\n4. Triangle\nSelect shape:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Radius: "); double r = sc.nextDouble();
                    System.out.println("Area: " + (Math.PI * r * r));
                }
                case 2 -> {
                    System.out.print("Side: "); double s = sc.nextDouble();
                    System.out.println("Area: " + (s * s));
                }
                case 3 -> {
                    System.out.print("L & B: "); double l = sc.nextDouble(), b = sc.nextDouble();
                    System.out.println("Area: " + (l * b));
                }
                case 4 -> {
                    System.out.print("Base & Height: "); double b = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Area: " + (0.5 * b * h));
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}