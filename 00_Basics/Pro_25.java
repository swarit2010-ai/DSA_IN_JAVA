import java.util.Scanner;
public class Pro_25 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter taxable income :");
            int income = sc.nextInt();
            System.out.println("Enter tax rate :");
            double tax_rate = sc.nextDouble();
            double tax = tax_rate/100 * income;
            System.out.println("The tax is : " + tax + " rupees");
        }
    }
}