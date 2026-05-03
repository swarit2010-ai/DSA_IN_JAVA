import java.util.Scanner;
public class Pro_05{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int s = n*n;
            int d,sum = 0;
            while(s != 0){
                d = s % 10;
                sum += d;
                s /= 10;
            }
            if(sum == n){
                System.out.println("The nunber is a neon number");
            }
            else{
                System.out.println("The number is not a neon number");
            }
        }
    }
}