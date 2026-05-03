import java.util.Scanner;
public class Pro_14 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int a = -1;
            int b = 1;
            int f = a+b;
            int fact_c = 0;
            for(int m = 1;m <= n;){
                for(int j = 1;j <= f;j++){
                    if(f % j == 0){
                        fact_c++;
                    }
                }
                if(fact_c == 2){
                    System.out.println(f);
                    m++;
                }
                a = b;
                b = f;
                f = a+b;
                fact_c = 0;
            }
        }
    }
}