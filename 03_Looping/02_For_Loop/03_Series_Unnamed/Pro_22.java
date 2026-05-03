import java.util.Scanner;
public class Pro_22{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int x;
        int y = 0;
        int z = 0;
        int sum = 1;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            x = y;
            y = z;
            z = sum;
            sum = x+y+z;
        }
    }
}