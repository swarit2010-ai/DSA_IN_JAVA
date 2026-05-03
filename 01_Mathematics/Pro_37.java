import java.util.Scanner;
public class Pro_37 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number :");
            int no = sc.nextInt();
            System.out.println("Enter another number :");
            int no_1 = sc.nextInt();
            int large = ((no+no_1) + Math.abs(no-no_1))/2;
            System.out.println("The largest no is " + large);
        }
    }
}