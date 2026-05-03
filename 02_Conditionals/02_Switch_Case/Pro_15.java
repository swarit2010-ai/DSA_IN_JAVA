import java.util.Scanner;
public class Pro_15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a character:");
            char ch = sc.next().charAt(0);
            int type = (Character.isDigit(ch)) ? 1 : (Character.isLetter(ch)) ? 2 : 3;
            switch (type) {
                case 1 -> System.out.println("It's a Digit");
                case 2 -> System.out.println("It's an Alphabet");
                case 3 -> System.out.println("It's a Special Symbol");
            }
        }
    }
}