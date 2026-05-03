import java.util.Scanner;
public class Pro_01 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int no = sc.nextInt();
            System.out.println("Enter another number:");
            int no2 = sc.nextInt();
            System.out.println("Enter last number:");
            int no3 = sc.nextInt();
            int large_no = (no > no2) ? (no > no3) ? no : no3 : (no2 > no3) ? no2 : no3;
            System.out.println("The largest no is " + large_no);
        }
    }
}