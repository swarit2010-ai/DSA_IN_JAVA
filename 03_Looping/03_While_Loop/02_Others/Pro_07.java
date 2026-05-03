import java.util.Scanner;
public class Pro_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,cb,sum = 0,pro = 1;
            double no_of_d = 0;
            while(n != 0){
                d = n % 10;
                cb = d*d*d;
                sum += cb;
                pro *= cb;
                no_of_d ++;
                n /= 10;
            }
            System.out.println("The sum of the cube of each digit is " + sum);
            System.out.println("The product of cube of each digit is " + pro);
            double avg = sum/no_of_d;
            System.out.println("The average of cube of each digit is " + avg);
        }
    }
}
