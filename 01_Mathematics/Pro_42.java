import java.util.Scanner;
public class Pro_42 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the name :");
            String name = sc.nextLine();
            System.out.println("Enter the class :");
            int cl = sc.nextInt();
            System.out.println("Enter the section :");
            int sec = sc.next().charAt(0);
            System.out.println("Enter the roll number :");
            int roll = sc.nextInt(); 
            sc.nextLine();
            System.out.println("Enter the school name :");
            String sc_name = sc.nextLine();
            System.out.println("\nThe name is " + name);
            System.out.println("The class is " + cl);
            System.out.println("The section is " + sec);
            System.out.println("The roll number is " + roll);
            System.out.println("The school name is " + sc_name);
        }
    }
}