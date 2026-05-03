import java.util.Scanner;
public class Pro_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        int x;
        int y = 0;
        int sum = 1;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            x = y;
            y = sum;
            sum = x+y+1;
        }
    }
}