import java.util.Scanner;
public class Pro_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        int sum = 0;
        for(int m = 1;m <= n;m++){
            sum += m;
            System.out.println(sum);
        }
    }
}