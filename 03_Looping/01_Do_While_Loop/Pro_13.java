//WAP to keep accepting student marks and after each entry, ask if there is another; once the user stops, calculate and display the average of all marks entered. 
import java.util.Scanner;
public class Pro_13 {
    static int choice = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double count = 0;
        double marks;
        double total = 0;
        do {
            System.out.println("Enter the marks :");
            marks = sc.nextDouble();
            count ++;
            total += marks;
            choice();
            if(choice == 2)
                break;
            else if(choice != 2 || choice != 1)
                System.out.println("Enter the correct choice");
        } while(choice == 1);
        double avg = total/count;
        System.out.println("The average is " + avg);
    }
    static void choice(){
        System.out.println("Is there any other entry ?.1 for yes and 2 for no");
        choice = sc.nextInt();
    }
}