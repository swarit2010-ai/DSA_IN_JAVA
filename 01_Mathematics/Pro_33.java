import java.util.Scanner;
public class Pro_33 {
    public static void main(String[] args) {
        System.out.println("Enter a two digit number:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int fd = no/10;
        int sd = no%10;
        int r = sd*10 + fd;
        System.out.println("The reverse of the number is " + r);
    }
}