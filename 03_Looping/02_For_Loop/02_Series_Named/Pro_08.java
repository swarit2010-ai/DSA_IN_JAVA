import java.util.Scanner;
public class Pro_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        int sum = 1;
        int a = 1;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            sum += a;
            a += 3;
        }
    }
}