import java.util.Scanner;
public class Pro_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter grade (A, B, C, D, F):");
            char grade = sc.next().toUpperCase().charAt(0);
            switch (grade) {
                case 'A' -> System.out.println("Excellent");
                case 'B' -> System.out.println("Good");
                case 'C' -> System.out.println("Fair");
                case 'D' -> System.out.println("Poor");
                case 'F' -> System.out.println("Failed");
                default -> System.out.println("Invalid Grade");
            }
        }
    }
}