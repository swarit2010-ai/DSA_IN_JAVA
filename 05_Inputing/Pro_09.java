import java.util.Scanner;
public class Pro_09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int primeCount = 0;
            System.out.println("Enter 25 integers:");
            for (int i = 1; i <= 25; i++) {
                int n = sc.nextInt();
                if (n <= 1) continue;
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) primeCount++;
            }
            System.out.println("Total prime numbers: " + primeCount);
        }
    }
}