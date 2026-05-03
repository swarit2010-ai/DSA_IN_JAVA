//WAP to simulate a stock inventory system starting with 50 items; ask the user how many items they want to buy, subtract them from the total, and repeat until the stock reaches zero or the user chooses to exit. 
import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stock = 50;
        int choice = 0;
        int items;
        do { 
            System.out.println("Enter the number of items you want to buy.");
            items = sc.nextInt();
            if(stock - items < 1){
                System.out.println("You can buy only " + stock + " items");
                stock -= items;
                break;
            }
            else
                System.out.println("Transaction completed");
            stock -= items;
            System.out.println("Do you want to buy more items or exit.1 for buy and 2 for exit");
            choice = sc.nextInt();
            if(choice > 1)
                break;
        } while(stock > 0 || choice == 1);
        if(stock < 1)
            System.out.println("Sory we ran out of stock.");
        else if(choice == 2)
            System.out.println("Task terminated");
        else
            System.out.println("Always enter the correct choice.");
        
    }
}