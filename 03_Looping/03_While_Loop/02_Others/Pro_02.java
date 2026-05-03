import java.util.Scanner;
public class Pro_02{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt(),d;
            int sum = 0,pro = 1;
            double no_of_d = 0;
            while(n != 0){
                d = n % 10;
                sum += d;
                pro *= d;
                no_of_d++;
                n /= 10;
            }
            System.out.println("The sum of the digits is : " + sum);
            System.out.println("The product of the digits is : " + pro);
            double avg = sum/no_of_d;
            System.out.println("The average of the digits is : " + avg);
        }
    }
}