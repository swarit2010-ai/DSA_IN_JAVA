import java.util.Scanner;
public class Pro_56 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter distance in km: ");
            double km = sc.nextDouble();
            System.out.println("Meters: " + (km * 1000));
            System.out.println("Centimeters: " + (km * 100000));
            System.out.println("Millimeters: " + (km * 1000000));
        }
    }
}