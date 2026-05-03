import java.util.Scanner;
public class Pro_02 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a year :");
            int year = sc.nextInt();
            System.out.println((year % 4 == 0) ? "Leap year" : "Not a leap year");
        }
    }
}