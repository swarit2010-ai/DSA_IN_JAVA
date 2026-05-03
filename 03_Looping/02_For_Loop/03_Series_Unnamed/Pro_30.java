import java.util.Scanner;
public class Pro_30{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int p;
        int c = 0;
        for(int m = 1;m <= n;m++){
            p = (int)Math.pow(x,m) + c;
            System.out.println(p);
            c++;
        }
    }
} 