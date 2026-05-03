import java.util.Scanner;
public class Pro_17 {
    public static void main(String[] args) {
            System.out.println("Enter a number:");
            try(Scanner sc = new Scanner(System.in)){
            int no1 = sc.nextInt();
            System.out.println("Enter another number :");
            int no2 = sc.nextInt();
            int s = no1-(-(no2));
            System.out.println("The sum of these numbers without using plus operator is " + s);
        }
    }
} 