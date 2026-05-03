//WAP to calculate the factorial of a number and ask the user if they want to calculate another factorial, repeating until they choose No. 
import java.util.Scanner;
public class Pro_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int f = 1;
        int choice;
        do { 
            System.out.println("Enter a number :");
            no = sc.nextInt();
            for(int i = 1;i <= no;i++){
                f *= i;
            }
            System.out.println("The factorial is " + f);
            System.out.println("Do you want to calculate another factorial ?.1 for yes and 2 for no");
            choice = sc.nextInt();
            f = 1;
        } while(choice == 1);
        System.out.println("Task terminated.");
    }
}