import java.util.Scanner;
public class Pro_45 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the length :");
            double l = sc.nextDouble();            
            System.out.println("Enter the breadth :");
            double b = sc.nextDouble();
            System.out.println("Enter the height :");
            double h = sc.nextDouble();
            double sa = 2 * (l*b + b*h + l*h);
            double v = l*b*h;
            System.out.println("The surface area is " + sa);
            System.out.println("The volume is " + v);
        }
    }
}