//WAP to create a unit converter menu (e.g., Kilometers to Miles, Celsius to Fahrenheit) that performs the conversion and returns to the menu until the "Exit" option is selected 
import java.util.Scanner;
public class Pro_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double input;
        double value;
        do {
            System.out.println("What do you want to convert :");
            System.out.println("1 for c to f and 2 for km to m");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the temperature in celsius");
                    input = sc.nextDouble();
                    value = input * 1.8 + 32;
                    System.out.println("The temperature in fahrenheit is " + value);
                }
                case 2 -> {
                    System.out.println("Enter the distance in km");
                    input = sc.nextDouble();
                    value = input * 0.621371;
                    System.out.println("The distance in miles is " + value);
                }
                default -> System.out.println("Enter the correct choice");
            }
            System.out.println("Do you want to continue with another conversion ?.1 for yes and 2 for no");
            choice = sc.nextInt();
            if(choice == 2)
                break;
        } while(choice == 1);
        System.out.println("Task terminated");
    }
}