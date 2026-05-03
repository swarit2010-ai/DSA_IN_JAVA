import java.util.Scanner;
public class Pro_15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,ld = 0;
            while(n != 0){
                d = n % 10;
                if(d > ld){
                    ld = d;
                }
                n /= 10;
            }
            System.out.println("The largest digit is " + ld);
        }
    }
}
