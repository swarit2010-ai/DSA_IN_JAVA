import java.util.Scanner;
public class Pro_25 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int p;
            int a = 2;
            for(int i = 1;i <= n;i++){
                p = (int)Math.pow(a,i);
                System.out.println(p);
                a++;
            }
        }
    }
}