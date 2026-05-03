import java.util.Scanner;
public class Pro_27 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the amount contributed by the first branch every year :");
            int amount_one = sc.nextInt();
            System.out.println("Enter the years the first branch contributed :");
            int years_one = sc.nextInt();
            System.out.println("Enter the amount contributed by the second branch every year :");
            int amount_two = sc.nextInt();
            System.out.println("Enter the years the second branch contributed :");
            int years_two = sc.nextInt();
            int total_contribution = (amount_one * years_one) + (amount_two * years_two);
            System.out.println("The total contribution made by both branches is : " + total_contribution + " rupees");
        }
    }
}