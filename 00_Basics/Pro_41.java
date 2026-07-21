import java.util.Scanner;
public class Pro_41 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter first number :");
            int no = sc.nextInt();
            System.out.println("Enter second number :");
            int no_1 = sc.nextInt();
            System.out.println("Enter third number :");
            int no_2 = sc.nextInt();
            double avg = (no + no_1 + no_2)/3.0;
            int sq_1 = no*no;
            int sq_2 = no_1*no_1;
            int sq_3 = no_2*no_2;
            int cb_1 = no*no*no;
            int cb_2 = no_1*no_1*no_1;
            int cb_3 = no_2*no_2*no_2;
            System.out.println("The square of first number is " + sq_1);
            System.out.println("The square of second number is " + sq_2);
            System.out.println("The square of third number is " + sq_3);
            System.out.println("The cube of first number is " + cb_1);           
            System.out.println("The cube of second number is " + cb_2);
            System.out.println("The cube of third number is " + cb_3);
            System.out.printf("The average of the three numbers is %.2f" , avg); 
        }
    }
}