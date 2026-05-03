import java.util.Scanner;
public class Pro_51 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the total number of students");
            double total = sc.nextDouble();
            System.out.println("Enter the number of boys");
            double boys = sc.nextDouble();
            double girls = total - boys;
            double per = girls/total * 100.0;
            System.out.println("The number of girls is " + girls + " and the percentage of girls is " + per);
        }
    }
}