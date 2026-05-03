import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter month number (1-12):");
            int m = sc.nextInt();
            switch (m) {
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 Days");
                case 4, 6, 9, 11 -> System.out.println("30 Days");
                case 2 -> System.out.println("28 or 29 Days");
                default -> System.out.println("Invalid Month");
            }
        }
    }
}