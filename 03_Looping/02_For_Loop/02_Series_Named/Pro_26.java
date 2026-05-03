import java.util.Scanner;
public class Pro_26 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int a = 1;
            int b = 0;
            int f;
            int p = 1;
            int fact = 0;
            int sum;
            for(int i = 1;i <= n;i++){
                while (true) { 
                    for(int j = 1;j <= p;j++){
                        if(p % j == 0)
                            fact++;
                    }
                    if(fact == 2){
                        break;
                    }
                    else{
                        p++;
                    }
                        
                    fact = 0;
                }
                f = a+b;
                a = b;
                b = f;
                sum = f + p;
                System.out.println(sum);
            }
        }
    }
}