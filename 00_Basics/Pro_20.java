import java.util.Scanner;
public class Pro_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money recieved in one month :");
        int money = sc.nextInt();
        System.out.println("Enter time in years :");
        int time = sc.nextInt();
        int total_money = money*12*time;
        System.out.println("The total money recieved is " + total_money + " rupees");
    }
}