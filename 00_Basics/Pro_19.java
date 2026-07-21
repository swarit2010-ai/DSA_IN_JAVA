import java.util.Scanner;
public class Pro_19 {
    public static void main(String[] args) {
        System.out.println("Enter your income in rupees :");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income > 300000){
            int tax_income = income - 300000;
            double tax = 15/100.0*tax_income;
            System.out.println("The tax is " + tax + " rupees");
        }
        else{
            System.out.println("You don't have to pay any tax");
        }
    }
}