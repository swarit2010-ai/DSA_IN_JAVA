import java.util.Scanner;
public class Pro_20 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int a = 1;
            int fact = 0;
            int sum = 0;
            for(int m = 1;m <= n;){
                for(int j = 1;j <= a;j++){
                    if(a % j == 0){
                        fact++;
                    }
                }
                if(fact == 2){
                    sum += a;
                    System.out.println(sum);
                    m++;
                }
                a++;
                fact = 0;
            }
        }
    }
}
