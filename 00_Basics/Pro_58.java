import java.util.Scanner;
public class Pro_58 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Items: "); int items = sc.nextInt();
            System.out.print("Price per item: "); double price = sc.nextDouble();
            System.out.print("Threshold for discount: "); double threshold = sc.nextDouble();
            System.out.print("Discount %: "); double discPer = sc.nextDouble();
            double total = items * price;
            if (total > threshold) {
                total -= (discPer / 100) * total;
            }
            System.out.println("Final Bill: " + total);
        }
    }
}