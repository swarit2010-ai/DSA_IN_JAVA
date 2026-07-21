import java.util.Scanner;
public class Pro_46 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the distance travelled :");
            double d = sc.nextDouble();            
            System.out.println("Enter the time in hours :");
            double t1 = sc.nextDouble();
            System.out.println("Enter the time in minutes :");
            double t2 = sc.nextDouble();
            double t = t1 + t2/60;
            double s = d/t;
            System.out.println("The speed is " + s);
        }
    }
}