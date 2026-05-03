import java.util.Scanner;
public class Pro_04{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int no_of_d = 0;
            int s = n*n;
            int cp =n;
            while(n != 0){
                no_of_d++;
                n /= 10;
            }
            double p = Math.pow(10,no_of_d);
            int ip = (int)p;
            int c = s % ip;
            if(cp == c){
                System.out.println("The number is an automorphic number");
            }
            else{
                System.out.println("The number is not an automorphic number");
            }
        }
    }
}