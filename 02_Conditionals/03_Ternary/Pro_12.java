import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a character:");
            char ch = sc.next().charAt(0);
            String type = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : 
            (ch >= 'a' && ch <= 'z') ? "Lowercase" : 
            (ch >= '0' && ch <= '9') ? "Digit" : "Special Symbol";
            System.out.println("Character is " + type);
        }
    }
}