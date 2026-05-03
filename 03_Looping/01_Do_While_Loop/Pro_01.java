//WAP to create a menu-driven calculator that performs addition, subtraction, multiplication, and division and continues until the user selects Exit. 
import java.util.Scanner;
public class Pro_01 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter :");
        System.out.println("1 for add\n2 for subtract\n3 for multiply\n4 for divide\n5 for exit");  
        double work = 0;
        int choice;
        do {
            System.out.println("Enter two numbers :");
            double no1 = sc.nextDouble();
            double no2 = sc.nextDouble();
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice){
                case 1 -> work = no1 + no2;
                case 2 -> work = no1 - no2;
                case 3 -> work = no1 * no2;
                case 4 -> work = no1 / no2;
            }
            System.out.println("The result is " + work);
        } while(choice != 5);
        System.out.println("Work terminated");
    }
}