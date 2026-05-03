import java.util.Scanner;
public class Pro_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int sum = 1;
        int x;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            x = m*m;
            sum += x;
        }
    }
}