import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        System.out.println("Enter another number :");
        int no2 = scanner.nextInt();
        int p = 1;
        for(int n = 1;n <= no2;n++){
            p = p*no;
        }
        System.out.println("The number powered to the other number is " + p);
    }
}