import java.util.Scanner;
public class Pro_08 {
    public static void main(String[] args) {
        System.out.println("Enter a year:");
        try (Scanner sc = new Scanner(System.in)) {
            int y = sc.nextInt();
            if(y % 100 == 0 && y % 400 == 0){
                System.out.println("The year is both a century leap year");
            }
            else if(y % 100 == 0){
                System.out.println("The year is a century year");
            }
            else if(y % 4 == 0){
                System.out.println("The year is only a leap year");
            }
            else{
                System.out.println("The year is neither a leap year nor a century year");
            }
        }
   }
}