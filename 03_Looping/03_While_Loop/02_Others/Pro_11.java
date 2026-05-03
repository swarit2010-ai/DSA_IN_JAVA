import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            System.out.println("Enter the number you want to check the presence of :");
            int c = sc.nextInt();
            int d;
            boolean check = false;
            while (n != 0){
                d = n % 10;
                if(d == c){
                    check = true;
                    break;
                }
                n /= 10;
            }
            if(check == true){
                System.out.println("The number contains the digit " + c);
            }
            else{
                System.out.println("The number does not contain the digit " + c);
            }
        }
    }
}
