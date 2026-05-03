import java.util.Scanner;
public class Pro_09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a character:");
            char ch = sc.next().toLowerCase().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                String res = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? "Vowel" : "Consonant";
                System.out.println(ch + " is a " + res);
            } else {
                System.out.println("Not an alphabetic character.");
            }
        }
    }
}