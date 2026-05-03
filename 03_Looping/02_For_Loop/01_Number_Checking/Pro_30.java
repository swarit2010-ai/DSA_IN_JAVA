import java.util.Scanner;
public class Pro_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        System.out.println("Enter the number of divisors");
        int k = sc.nextInt();
        int div = 0;
        for(int i = 1;i <= no;i++){
            if(no % i == 0)
                div++;
        }
        if(div == k)
            System.out.println("It is a k divisors number");
        else
            System.out.println("It is not a k divisor number");
   }
}