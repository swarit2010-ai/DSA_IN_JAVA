import java.util.Scanner;
public class Pro_06 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number :");
            int n = sc.nextInt();
            int prev_div = 1;
            int div = 0;
            boolean check = false;
            for(int i = 2;i <= n;i++){
                for(int j = 1;j <= i;j++){
                    if(i % j == 0)
                        div++;
                }
                if(div > prev_div){
                    check = true;
                    prev_div = div;
                }
                else if(i != n)
                    check = false;
                div = 0;
            }
            if(check == true)
                System.out.println("It is a highly composite number");
            else
                System.out.println("It is not a highly composite number");
        }
    }
}