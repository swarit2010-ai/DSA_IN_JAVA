import java.util.Scanner;
public class Pro_29 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the base :");
            double base = sc.nextDouble();
            System.out.println("Enter the height :");
            double height = sc.nextDouble();
            double area = 0.5*base*height;
            System.out.println("The area of the triangle is " + area);
        }
    }
}