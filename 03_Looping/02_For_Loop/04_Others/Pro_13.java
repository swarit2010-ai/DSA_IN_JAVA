import java.util.Scanner;
public class Pro_13 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner scanner = new Scanner(System.in)) {
            int no = scanner.nextInt();
            int s = 0;
            for(int n = 1;n <= no;n++){
                s = s+n;
            }
            System.out.println("The sum of all natural numbers upto the inputed number is " + s);
        }
    }
}