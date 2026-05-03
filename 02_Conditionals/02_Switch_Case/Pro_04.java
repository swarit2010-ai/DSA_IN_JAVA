import java.util.Scanner;
public class Pro_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an alphabet:");
            char ch = sc.next().toLowerCase().charAt(0);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
                default -> System.out.println((ch >= 'a' && ch <= 'z') ? "Consonant" : "Not a letter");
            }
        }
    }
}