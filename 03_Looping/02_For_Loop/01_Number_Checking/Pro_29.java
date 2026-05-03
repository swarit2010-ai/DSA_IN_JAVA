import java.util.Scanner;
public class Pro_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        double no = sc.nextDouble();
        boolean check = false;
        int sum;
        int fact = 0;
        outer:
            for(int i = 2;i <= no;i++){
                for(int j = 1;j <= i;j++){
                    if(i % j == 0)
                        fact++;
                }
                if(fact == 2){
                    for(int m = i+1;true;m++){
                        sum = i+m;
                        if(sum == no){
                            check = true;
                            break outer;
                        }
                        if(sum > no)
                            break;
                    }
                }
                fact = 0;
            }
        if(check == true)
            System.out.println("It is a sum of two primes number");
        else
            System.out.println("It is not a sum of two primes number");
   }
}