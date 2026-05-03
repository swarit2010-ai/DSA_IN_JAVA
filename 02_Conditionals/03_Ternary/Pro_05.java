import java.util.Scanner;
public class Pro_05 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the sales :");
            int sales = sc.nextInt();
            int commission = (sales <= 2000) ? 2 : (sales <= 5000) ? 5 : (sales <= 8000) ? 8 : 10;
            System.out.println("Commision is " + commission/100.0*sales + " rupees");
        }
    }
}