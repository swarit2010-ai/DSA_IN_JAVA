//WAP to accept a principal amount and interest rate, calculate the balance after one year, and ask the user if they want to see the balance for the next year (compounded) or exit. 
import java.util.Scanner;
public class Pro_11 {
    static double amount;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,r;
        int choice;
        do {
            System.out.println("Enter the principal amount:");
            p = sc.nextDouble();
            System.out.println("Enter the rate of interest");
            r = sc.nextDouble();
            amount(p,r);
            p = amount;
            System.out.println("Do you want to see the balance for next year also.1 for yes and 2 for no");
            choice = sc.nextInt();
            if(choice == 1){
                do {
                    amount(p,r);
                    System.out.println("Do you want to see the balance for next year also.1 for yes and 2 for no");
                    choice = sc.nextInt();
                    if(choice > 1)
                        break;
                    p = amount;
                } while (choice == 1);
            }
            System.out.println("Do you want to see the amount for another criteria.1 for yes and 2 for no");
            choice = sc.nextInt();
            if(choice > 1)
                break;
        } while(choice == 1);
        System.out.println("Task terminated");
    }
    static void amount(double p,double r){
        amount = p + p*r/100.0;
        System.out.println("The amount is " + amount);
    }
}