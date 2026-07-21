import java.util.Scanner;
public class Pro_34 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a three digit number :");
            int no = sc.nextInt();
            int ld = no%10;
            int new_no = no/10;
            int md = new_no%10;
            int fd = new_no/10;
            System.out.println("The first digit is : " + fd);
            System.out.println("The middle digit is : " + md);
            System.out.println("The last digit is : " + ld);
        }
    }
}