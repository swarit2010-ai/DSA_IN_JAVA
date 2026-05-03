import java.util.Scanner;
public class Pro_39 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of days :");
            int days = sc.nextInt();
            int years = days / 365;
            int weeks = (days - (years * 365))/7;
            int days_left = days - (years * 365 + weeks * 7);
            System.out.println("The days " + days + " can be divided into " + years + " years , " + weeks + " weeks and " + days_left + " days");
        }
    }
}