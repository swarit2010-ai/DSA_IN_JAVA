import java.util.Scanner;
public class Pro_26 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter money recieved each month :");
            int money_month = sc.nextInt();
            System.out.println("Enter no of years :");
            int years = sc.nextInt();
            int scholarship = money_month * 12 * years;
            System.out.println("The scholarship amount is : " + scholarship + " rupees");
        }
    }
}