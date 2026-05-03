import java.util.Scanner;
public class Pro_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,sum = 0,pro = 1;
            while(n != 0){
                d = n % 10;
                if(d % 2 == 0){
                    pro *= d;
                }
                else{
                    sum += d;
                }
                n /= 10;
            }
            System.out.println("The sum of odd digits is " + sum);
            System.out.println("The product of even digits is " + pro);
        }
    }
}
