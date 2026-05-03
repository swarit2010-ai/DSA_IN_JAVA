import java.util.Scanner;
public class Pro_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter color code (R, G, B, Y):");
            char code = sc.next().toUpperCase().charAt(0);
            switch (code) {
                case 'R' -> System.out.println("Red");
                case 'G' -> System.out.println("Green");
                case 'B' -> System.out.println("Blue");
                case 'Y' -> System.out.println("Yellow");
                default -> System.out.println("Unknown Color");
            }
        }
    }
}