import java.util.Scanner;
public class Pro_57 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            double vol = (4.0/3.0) * Math.PI * Math.pow(r, 3);
            double sa = 4 * Math.PI * r * r;
            System.out.println("Volume: " + vol + "\nSurface Area: " + sa);
        }
    }
}