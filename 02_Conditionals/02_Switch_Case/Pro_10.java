import java.util.Scanner;
public class Pro_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter category (K, T, A, S):");
            char cat = sc.next().toUpperCase().charAt(0);
            switch (cat) {
                case 'K' -> System.out.println("Kid (0-12)");
                case 'T' -> System.out.println("Teenager (13-19)");
                case 'A' -> System.out.println("Adult (20-59)");
                case 'S' -> System.out.println("Senior Citizen (60+)");
                default -> System.out.println("Invalid Category");
            }
        }
    }
}