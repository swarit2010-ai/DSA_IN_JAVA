import java.util.Scanner;
public class Pro_36 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a three digit number :");
            int no = sc.nextInt();
            int ld = no%10;
            int new_no = no/10;
            int md = new_no%10;
            int fd = new_no/10;
            int reverse = ld*100+md*10+fd;
            System.out.println("The reverse of the number is : " + reverse);
        }
    }
}