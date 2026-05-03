//WAP to input a number, reverse it, and ask the user whether to continue, repeating the process until the user chooses not to continue. 
import java.util.Scanner;
public class Pro_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int r = 0;
        int cp;
        int d;
        String cont;
        do { 
            System.out.println("Enter a number");
            no = sc.nextInt();
            cp = no;
            while(no != 0){
                d = no % 10;
                r = r * 10 + d;
                no /= 10;
            }
            no = cp;
            System.out.println("The reverse is " + r);
            System.out.println("Do you want to continue ? Yes or no");
            cont = sc.next();
            if(cont.toLowerCase().equals("no")){
                break;
            }
            r = 0;        
        } while(true);
        System.out.println("Task terminated");
    }
}