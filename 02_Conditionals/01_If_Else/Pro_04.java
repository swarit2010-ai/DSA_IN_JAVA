import java.util.Scanner;
public class Pro_04{
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int no = sc.nextInt();
            if(no > 0){
                System.out.println("The number is positive");
            }
            else if(no < 0){
                System.out.println("The number is negative");
            }
            else{
                System.out.println("The number is zero");
            }
        }
    }
}