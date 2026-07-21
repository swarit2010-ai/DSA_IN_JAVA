import java.util.Scanner;
public class Pro_28 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the radius :");
            double r = sc.nextDouble();
            double area = Math.PI*r*r;
            double per = 2*Math.PI*r;
            System.out.println("The area of the circle is " + area);
            System.out.println("The perimeter of the circle is " + per);
        }
    }
}