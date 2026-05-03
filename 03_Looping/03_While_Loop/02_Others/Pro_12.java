import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,odd_sum = 0,even_sum = 0,odd_pro = 1,even_pro = 1;
            double odd_no = 0,even_no = 0;
            while(n != 0){
                d = n % 10;
                if(d % 2 == 1){
                    odd_sum += d;
                    odd_pro *= d;
                    odd_no++;
                }
                else{
                    even_sum += d;
                    even_pro *= d;
                    even_no++;
                }
                n /= 10;
            }
            System.out.println("The sum of all the odd digits is " + odd_sum);
            System.out.println("The sum of all the even digits is " + even_sum);
            System.out.println("The product of all the odd digits is " + odd_pro);
            System.out.println("The product of all the even digits is " + even_pro);
            double odd_avg = odd_sum/odd_no;
            double even_avg = even_sum/even_no;
            System.out.println("The average of all the odd digits is " + odd_avg);
            System.out.println("The average of all the even digits is " + even_avg);
        }
    }
}
