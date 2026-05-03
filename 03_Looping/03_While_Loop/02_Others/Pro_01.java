import java.util.Scanner;
public class Pro_01{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt(),d;
            System.out.println("The digits are :");
            while(n != 0){
                d = n % 10;
                System.out.println(d);
                n /= 10;
            }
        }
    }
}