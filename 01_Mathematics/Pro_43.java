import java.util.Scanner;
public class Pro_43 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the principal :");
            double p = sc.nextDouble();            
            System.out.println("Enter the rate :");
            double r = sc.nextDouble();            
            System.out.println("Enter the time :");
            double t = sc.nextDouble();
            double am = p* Math.pow((1 + r/100),t);
            double ci = am - p;
            System.out.println("The compound interest is " + ci);
        }
    }
}