import java.util.Scanner;
public class Pro_27 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int c = 0;
            for(int i = 1;i <= n;i++){
                if(i % 2 == 0)
                    c -= i;
                else
                    c += i;
                System.out.println(c);
            }
        }
    }
}