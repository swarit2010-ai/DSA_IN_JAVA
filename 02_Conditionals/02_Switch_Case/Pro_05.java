import java.util.Scanner;
public class Pro_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            double a = sc.nextDouble(), b = sc.nextDouble();
            System.out.println("Enter operator (+, -, *, /):");
            char op = sc.next().charAt(0);
            switch (op) {
                case '+' -> System.out.println("Result: " + (a + b));
                case '-' -> System.out.println("Result: " + (a - b));
                case '*' -> System.out.println("Result: " + (a * b));
                case '/' -> System.out.println(b != 0 ? "Result: " + (a / b) : "Cannot divide by zero");
                default -> System.out.println("Invalid operator");
            }
        }
    }
}