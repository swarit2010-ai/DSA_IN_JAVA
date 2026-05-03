import java.util.Scanner;
public class Pro_14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0;
            System.out.println("Enter 25 integers:");
            for (int i = 1; i <= 25; i++) {
                int n = Math.abs(sc.nextInt());
                if (n >= 10 && n <= 99) count++;
            }
            System.out.println("Count of two-digit numbers: " + count);
        }
    }
}