import java.util.Scanner;
public class Pro_03 {
    public static void main(String[] args) {
        System.out.println("Enter a year:");
        try (Scanner sc = new Scanner(System.in)) {
            int y = sc.nextInt();
            if(y % 4 == 0){
                System.out.println("The year is a leap year");
            }
            else{
                System.out.println("The year is not a leap year");
            }
        }
    }
}