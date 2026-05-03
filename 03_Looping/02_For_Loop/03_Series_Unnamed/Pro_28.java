import java.util.Scanner;
public class Pro_28{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int x = 2;
        int sum = 1;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            sum += x*x;
            x++;
        }
    }
} 