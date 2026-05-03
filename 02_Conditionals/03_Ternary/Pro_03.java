import java.util.Scanner;
public class Pro_03 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your age :");
            int age = sc.nextInt();
            System.out.println((age >= 18) ? "Eligible" : "Not eligible");
        }
    }
}