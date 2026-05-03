import java.util.Scanner;
public class Pro_21 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            int a = 0,b,dif;
            for(int m = 1;m <= n;m++){
                b = m*m;
                dif = b-a;
                a = b;
                System.out.println(dif);
            }
        }
    }
}
