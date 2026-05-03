import java.util.Scanner;
public class Pro_10{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,s,sum = 0;
            boolean check = false;
            while (true) { 
                while(n != 0){
                    d = n % 10;
                    s = d*d;
                    sum += s;
                    n /= 10;
                }
                if(sum == 1){
                    check = true;
                    break;
                }
                else if(sum == 4){
                    break;
                }
                n = sum;
                sum = 0;
            }
            if(check == true){
                System.out.println("The number is a happy number");
            }
            else{
                System.out.println("The number is not a happy number");
            }
        }
    }
}