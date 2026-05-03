import java.util.Scanner;
public class Pro_50 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius");
            double r = sc.nextDouble();
            System.out.println("Enter the height");
            double h = sc.nextDouble();
            double volume = 1/3.0 * Math.PI * r*r * h;
            System.out.println("The volume is " + volume);
        }
    }
}