import java.util.Scanner;
public class Pro_11{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int cp = n;
            int d;
            int p,sum = 0;
            int no_of_d = 0;
            while(n != 0){
                no_of_d++;
                n /= 10;
            }
            n = cp;
            int pos = no_of_d;
            while(n != 0){
                d = n % 10;
                p = (int)Math.pow(d,pos);
                sum += p;
                n /= 10;
                pos--;
            }
            if(sum == cp){
                System.out.println("The number is a disarium number");
            }
            else{
                System.out.println("The number is not a disarium number");
            }
        }
    }
}