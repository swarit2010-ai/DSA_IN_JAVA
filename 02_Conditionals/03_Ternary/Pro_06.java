import java.util.Scanner;
public class Pro_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three angles:");
            int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt();
            String result = (a1 + a2 + a3 == 180 && a1 > 0 && a2 > 0 && a3 > 0) ? "Valid Triangle" : "Invalid Triangle";
            System.out.println(result);
        }
    }
}