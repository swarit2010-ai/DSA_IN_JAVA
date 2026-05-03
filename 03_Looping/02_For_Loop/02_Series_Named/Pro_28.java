import java.util.Scanner;
public class Pro_28 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int fact = 1;
            int d,pro = 1;
            for(int m = 1;m <= n;m++){
                for(int i = 1;i <= m;i++){
                    fact *= i;
                }
                while(fact != 0){
                    d = fact % 10;
                    pro *= d;
                    fact /= 10;
                }
                System.out.println(pro);
                fact = 1;
                pro = 1;
            }
        }
    }
}