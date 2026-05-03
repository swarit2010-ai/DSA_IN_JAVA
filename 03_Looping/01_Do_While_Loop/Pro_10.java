//WAP to print the multiplication table of a number and repeat the process until the user chooses to stop. 
import java.util.Scanner;
public class Pro_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int choice;
        int start = 1,end = 10;
        do { 
            System.out.println("Enter a number :");
            no = sc.nextInt();
            multiple(start,end,no);
            start += 10;
            end += 10;
            System.out.println("Do you want to continue.1 for yes and 2 for no");
            choice = sc.nextInt();
            if(choice == 1){
                do{
                multiple(start, end, no);
                System.out.println("Do you want to continue.1 for yes and 2 for no");
                choice = sc.nextInt();
                if(choice > 2){
                    break;
                }
                start += 10;
                end += 10;
                }while(choice == 1);
            }
            System.out.println("Do you want the table for another number.1 for yes and 2 for no");
            choice = sc.nextInt();
            if(choice == 2)
                break;
            start = 1;
            end = 10;
        } while(choice == 1);
        System.out.println("Task terminated");
    }
    static void multiple(int start,int end,int no){
        System.out.println("The multiples till " + end + " is ");
        for(int i = start;i <= end;i++)
            System.out.println(no*i);
    }
}