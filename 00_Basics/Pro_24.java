import java.util.Scanner;
public class Pro_24 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the distance in feet :");
            double dis = sc.nextDouble();
            double dis_in_yards = dis/3;
            double dis_in_miles = dis_in_yards/1760;
            System.out.println("Distance in yards :" + dis_in_yards);
            System.out.println("Distance in miles :" + dis_in_miles);
        }
    }
}