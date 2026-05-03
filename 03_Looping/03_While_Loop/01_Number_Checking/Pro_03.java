import java.util.Scanner;
public class Pro_03{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int cp = n;
            int f = 1;
            int d,sum = 0;
            while(n != 0){
                d = n % 10;
                for(int a = 1;a <= d;a++){
                    f *= a;
                }
                sum += f;
                f = 1;
                n /= 10;
            }
            if(sum == cp){
                System.out.println("The number is a special number");
            }
            else{
                System.out.println("The number is not a special number");
            }
        }
    }
}