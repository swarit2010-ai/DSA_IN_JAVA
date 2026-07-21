import java.util.Scanner;
public class Pro_35 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a three digit number :");
            int no = sc.nextInt();
            int ld = no%10;
            int new_no = no/10;
            int md = new_no%10;
            int fd = new_no/10;
            int p = fd * md * ld;
            int s = fd + md + ld;
            System.out.println("The sum of the digits of the number is : " + s);
            System.out.println("The product of the digits of the number is " + p);
        }
    }
}