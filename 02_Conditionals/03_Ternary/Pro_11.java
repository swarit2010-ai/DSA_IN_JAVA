import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter annual income:");
            double inc = sc.nextDouble();
            double taxPer = (inc <= 250000) ? 0 : (inc <= 500000) ? 5 : (inc <= 1000000) ? 20 : 30;
            System.out.println("Tax amount: " + (taxPer / 100.0 * inc));
        }
    }
}