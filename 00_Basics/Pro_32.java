import java.util.Scanner;
public class Pro_32 {
    public static void main(String[] args) {
        System.out.println("Enter a two digit number:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int fd = no/10;
        int sd = no%10;
        int s = fd + sd;
        int p = fd * sd;
        System.out.println("The sum of the digits is " + s);
        System.out.println("The product of the digits is " + p);
    }
}