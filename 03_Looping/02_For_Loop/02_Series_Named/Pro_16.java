import java.util.Scanner;
public class Pro_16 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int d;
            int sum = 0;
            int a;
            for(int m = 1;m <= n;m++){
                a =  m;
                while(a != 0){
                    d = a % 10;
                    sum += d;
                    a /= 10;
                }
                System.out.println(sum);
                sum = 0;
            }
        }
    }
}