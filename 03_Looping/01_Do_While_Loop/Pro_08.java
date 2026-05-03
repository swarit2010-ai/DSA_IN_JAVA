//WAP to simulate a simple shopping cart system that allows the user to add item prices and view the total until Exit is selected. 
import java.util.Scanner;
public class Pro_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int total = 0;
        int amt;
        outer:
        do { 
            System.out.println("Enter 1 to add item prizes, 2 to view the total and 3 to exit :");
            choice = sc.nextInt();
            switch(choice){
                case 1 -> {
                    System.out.println("Enter the amount of items you want to add :");
                    amt = sc.nextInt();
                    total += amt;
                }
                case 2 -> System.out.println("The total bill is " + total);
                case 3 -> {
                    System.out.println("Exiting from system.");
                    break outer;
                }
                default -> System.out.println("Enter correct case");
            }
        } while(true);
        System.out.println("Thank you. Visit again");
    }
}