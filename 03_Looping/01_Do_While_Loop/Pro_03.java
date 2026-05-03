//WAP to simulate an ATM machine that allows the user to deposit, withdraw, check balance, and exit, and continues until Exit is chosen. 
import java.util.Scanner;
public class Pro_03 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        double money = 50000;
        int choice;
        do {
            System.out.println("Enter :");
            System.out.println("1 for withdraw\n2 for deposit\n3 for check balance\n4 for exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            double mn;
            switch(choice){
                case 1 -> {
                    System.out.println("Enter withdrawal amount");
                    mn = sc.nextDouble();
                    money -= mn;
                }
                case 2 -> {
                    System.out.println("Enter deposit money");
                    mn = sc.nextDouble();
                    money += mn;
                }
                case 3 -> System.out.println("Your balance is " + money);
            }
        } while(choice != 4);
        System.out.println("Exited");
    }
}