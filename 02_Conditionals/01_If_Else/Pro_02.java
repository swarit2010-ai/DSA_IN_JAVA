import java.util.Scanner;
public class Pro_02 {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        try (Scanner sc = new Scanner(System.in)) {
            int no = sc.nextInt();
            if(no % 3 == 0 && no % 5 == 0){
                System.out.println("The no. is divisible by both 3 and 5");
            }
            else if(no % 3 == 0){
                System.out.println("The no. is only divisible by 3");
            }
            else if(no % 5 == 0){
                System.out.println("The no. is only divisible by 5");
            }
            else{
                System.out.println("The no. is neither divisible by 3 nor 5");
            }
        }
    }
}