import java.util.Scanner;
public class Pro_09{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            boolean check = false;
            int d,sum = 0,no_of_d = 0,cp = n;
            while(n != 0){
                no_of_d++;
                n /= 10;
            }
            n = cp;
            for(int m = 1;m <= no_of_d;m++){
                while(n != 0){
                    d = n % 10;
                    sum += d;
                    n /= 10;
                }
                if(sum == 1){
                    check = true;
                    break;
                }
                n = sum;
                sum = 0;
            }
            if(check == false){
                System.out.println("The number is not a magic number");
            }
            else{
                System.out.println("The number is a magic number");
            }
        }
    }
}