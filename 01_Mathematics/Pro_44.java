import java.util.Scanner;
public class Pro_44 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the cost price :");
            double cp = sc.nextDouble();            
            System.out.println("Enter the profit percentage :");
            double pp = sc.nextDouble();
            double p = pp/100 * cp;
            double sp = cp + p;
            System.out.println("The selling price is " + sp);
            System.out.println("The profit is " + p);
        }
    }
}