import java.util.Scanner;
public class Pro_48 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length and breadth :");
            int l = sc.nextInt();
            int b = sc.nextInt();
            int p = 2*(l+b);
            System.out.println("Enter rate per metre :");
            int rate = sc.nextInt();
            int cost = p * rate;
            System.out.println("The cost for fencing the field is " + cost);
        }
    }
}