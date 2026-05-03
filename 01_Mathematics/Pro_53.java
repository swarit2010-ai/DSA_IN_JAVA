import java.util.Scanner;
public class Pro_53{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of hours");
            double hrs = sc.nextDouble();
            System.out.println("Enter the hourly wage");
            double wage = sc.nextDouble();
            double bill;
            if(hrs <= 8)
                bill = hrs * wage;
            else
                bill = 8 * wage + (hrs - 8) * wage * 1.5;
            System.out.println("The salary is " + bill);
        }
    }
}