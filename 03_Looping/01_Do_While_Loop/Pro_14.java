//WAP to accept a character from the user, determine if it is a vowel or a consonant, and repeat the process until the user chooses to stop. 
import java.util.Scanner;
public class Pro_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char let[] = {'a','e','i','o','u'};
        int choice;
        boolean check = false;
        do {
            System.out.println("Enter an alphabet:");
            char letter = sc.next().charAt(0);
            for(char element:let){
                if(element == letter){
                    check = true;
                    break;
                }
            }
            if(check == true)
                System.out.println("It is a vowel");
            else
                System.out.println("It is a consonent");
            System.out.println("Do you want to continue.1 for yes and 2 for no");
            choice = sc.nextInt();
            if(choice == 2){
                break;
            }
            check = false;
        } while(choice == 1);
        System.out.println("Task terminated");
    }
}