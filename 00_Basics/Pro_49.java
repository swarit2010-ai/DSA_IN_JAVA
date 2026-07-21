import java.util.Scanner;
public class Pro_49 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the parallel sides :");
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            System.out.println("Enter the base");
            int b = sc.nextInt();
            System.out.println("Enter the height");
            int h = sc.nextInt();
            double area = 0.5 * (p1 + p2) * h;      
            System.out.println("The area is " + area);
        }
    }
}