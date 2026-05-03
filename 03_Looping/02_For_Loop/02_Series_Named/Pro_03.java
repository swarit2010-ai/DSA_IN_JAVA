import java.util.Scanner;
public class Pro_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        System.out.println("Enter two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            sum *= b;
        }
    }
}