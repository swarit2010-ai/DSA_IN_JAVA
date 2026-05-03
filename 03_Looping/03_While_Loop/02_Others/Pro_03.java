import java.util.Scanner;
public class Pro_03{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int no_of_d = 0;
            while(n != 0){
                no_of_d++;
                n /= 10;
            }
            System.out.println("The number of digits is : " + no_of_d);
        }
    }
}