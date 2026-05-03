import java.util.Scanner;
public class Pro_14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Season (1-Summer, 2-Winter, 3-Monsoon):");
            int s = sc.nextInt();
            switch (s) {
                case 1 -> System.out.println("It's Summer!");
                case 2 -> System.out.println("It's Winter!");
                case 3 -> System.out.println("It's Monsoon!");
                default -> System.out.println("Invalid choice");
            }
        }
    }
}