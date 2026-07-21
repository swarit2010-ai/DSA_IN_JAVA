import java.util.Scanner;
public class Pro_15 {
    public static void main(String[] args) {
            System.out.println("Enter a number:");
        try(Scanner sc = new Scanner(System.in)){
            int no1 = sc.nextInt();
            System.out.println("Enter another number :");
            int no2 = sc.nextInt();
            System.out.println("The first number is " + no1);
            System.out.println("The second number is " + no2);
            int no3 = no1+no2;
            no1 = no3-no1;
            no2 = no3-no2;
            System.out.println("The interchanged first number is " + no1);
            System.out.println("The interchanged second number is " + no2);
        }
    }
}