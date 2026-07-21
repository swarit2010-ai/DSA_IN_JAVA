import java.util.Scanner;
public class Pro_54{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the marked price");
            double price = sc.nextDouble();
            System.out.println("Enter the discount percentage");
            double per = sc.nextDouble();
            double dis = per / 100.0 * price;
            double total = price - dis;
            System.out.println("The discount amount is " + dis);
            System.out.println("The final price is " + total);
        }
    }
}