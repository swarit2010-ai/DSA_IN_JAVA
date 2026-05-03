import java.util.Scanner;
public class Pro_14{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int c = 0,sum_1 = 0,sum_2 = 0,d;
            int no_d = 0;
            int cp = n;
            while(n != 0){
                no_d ++;
                n /= 10;
            }
            n = cp;
            while(n != 0){
                c++;
                d = n % 10;
                if(c == 1 || c == no_d){
                    sum_1 += d;
                }
                else{
                    sum_2 += d;
                }
                n /= 10;
            }
            if(sum_1 == sum_2){
                System.out.println("The number is a phloem number");
            }
            else{
                System.out.println("The number is not a phloem number");
            }
        }
    }
}