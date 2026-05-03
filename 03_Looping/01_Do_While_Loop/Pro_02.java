//WAP to ask the user to enter a password and keep asking until the correct password is entered. 
import java.util.Scanner;
public class Pro_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "sharma 2010";
        boolean pass = false;
        do {
            System.out.println("Enter the password :");
            String input = sc.nextLine();
            if(input.equals(password))
                pass = true;
            else
                System.out.println("Incorrect Password.Try again");
        } while(pass != true);
        System.out.println("Logged in.");
    }
}