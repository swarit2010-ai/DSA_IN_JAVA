import java.util.Scanner;
public class Pro_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        int sum;
        System.out.println(0 + "\n" + 1);
        for(int m = 1;m <= n - 2;m++){
            sum = t1 + t2;
            System.out.println(sum);
            t1 = t2;
            t2 = sum;
        }
    }
}