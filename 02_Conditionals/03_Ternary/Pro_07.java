import java.util.Scanner;
public class Pro_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            double n = sc.nextDouble();
            String res = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
            System.out.println("The number is " + res);
        }
    }
}