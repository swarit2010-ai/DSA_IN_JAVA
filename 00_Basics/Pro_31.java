import java.util.Scanner;
public class Pro_31 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number");
            int no = sc.nextInt();
            int no_no_ld = no/10;
            System.out.println("The number without the last digit is " + no_no_ld);
        }
    }
}