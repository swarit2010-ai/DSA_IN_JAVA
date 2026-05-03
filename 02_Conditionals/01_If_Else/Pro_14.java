import java.util.Scanner;
public class Pro_14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your income in rupees :");
            double inc = sc.nextDouble();
            double taxp = 0.0;
            if(inc >= 250000 && inc <= 500000){
                taxp = 5.0;
            }
            else if(inc >= 500000 && inc <= 1000000){
                taxp = 20.0;
            }
            else if(inc > 1000000){
                taxp = 30.0;
            }
            else {
                System.out.println("No tax for you.Earn less,spend more");
            }
            double tax = (taxp/100)*inc;
            if(taxp != 0){
                System.out.println("You have to pay " + tax + " rupees tax");
            }
        }
    }
}