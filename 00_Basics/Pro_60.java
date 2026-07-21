import java.util.Scanner;
public class Pro_60 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Years: "); int t = sc.nextInt();
            System.out.print("Principal: "); double p = sc.nextDouble();
            System.out.print("Annual increase %: "); double r = sc.nextDouble();
            double finalAmount = p * Math.pow((1 + r/100), t);
            System.out.println("Final Amount after growth: " + finalAmount);
        }
    }
}