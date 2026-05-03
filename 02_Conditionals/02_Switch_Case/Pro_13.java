import java.util.Scanner;
public class Pro_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Vehicle (C-Car, B-Bus, T-Truck, M-Bike):");
            char v = sc.next().toUpperCase().charAt(0);
            switch (v) {
                case 'C' -> System.out.println("Toll: 100");
                case 'B' -> System.out.println("Toll: 200");
                case 'T' -> System.out.println("Toll: 300");
                case 'M' -> System.out.println("Toll: 20");
                default -> System.out.println("Invalid Vehicle Type");
            }
        }
    }
}