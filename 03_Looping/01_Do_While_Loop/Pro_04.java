//WAP to create a number guessing game that keeps asking the user to guess a number until the correct number is guessed. 
import java.util.Scanner;
public class Pro_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int r;
        do { 
            r = (int)(10*Math.random());
            System.out.println("Enter a single digit number");
            no = sc.nextInt();
            if(no >= 10)
                System.out.println("Enter correctly.");
            if(no != r)
                System.out.println("Not a match");
        } while (no != r);
        System.out.println("Bingo.");
    }
}