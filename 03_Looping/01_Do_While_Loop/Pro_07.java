//WAP to accept a number between 1 and 100 and keep asking the user until a valid number in the given range is entered. 
import java.util.Scanner;
public class Pro_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        do { 
            System.out.println("Enter a number between 1 and 100");   
            no = sc.nextInt();     
            if(no > 1 && no < 100){
                System.out.println("Correct input.");
                break;
            }
            else
                System.out.println("Retry.");
        } while(true);
    }
}
