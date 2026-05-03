//WAP to accept numbers from the user and find their sum until a negative number is entered. 
import java.util.Scanner;
public class Pro_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int sum = 0;
        do { 
            System.out.println("Enter a number");
            no = sc.nextInt();
            if(no < 0)
                break;
            else
                sum += no;
        } while (no > -1);
        System.out.println("The sum is " + sum);
    }
}