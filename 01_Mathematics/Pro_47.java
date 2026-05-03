import java.util.Scanner;
public class Pro_47 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of units consumed:");
            int units = sc.nextInt();
            System.out.println("Enter rate for first 100 units:");
            double rate1 = sc.nextDouble();
            System.out.println("Enter rate for next units (above 100):");
            double rate2 = sc.nextDouble();
            double bill = 0;
            if (units <= 100) {
                bill = units * rate1;
            } else {
                bill = (100 * rate1) + ((units - 100) * rate2);
            }
            System.out.println("The total electricity bill is: " + bill);
        }
    }
}