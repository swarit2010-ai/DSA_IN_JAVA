import java.util.Scanner;
public class Pro_09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int no_of_d = 0;
            while(n != 0){
                no_of_d++;
                n /= 10;
            }
            if(no_of_d % 2 == 0){
                System.out.println("No middle digit present");
            }
            else{
                System.out.println("Middle digit is present");
            }
        }
    }
}
