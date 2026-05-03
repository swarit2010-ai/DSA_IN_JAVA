import java.util.Scanner;
public class Pro_59 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Monthly Income: "); double inc = sc.nextDouble();
            System.out.print("Monthly Expense: "); double exp = sc.nextDouble();
            double annualSavings = (inc - exp) * 12;
            System.out.println("Annual Savings: " + annualSavings);
        }
    }
}