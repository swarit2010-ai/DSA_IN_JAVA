import java.util.Scanner;
public class Pro_30 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number");
            int no = sc.nextInt();
            int last_digit = no%10;
            System.out.println("The last digit of the number is : " + last_digit);
        }
    }
}