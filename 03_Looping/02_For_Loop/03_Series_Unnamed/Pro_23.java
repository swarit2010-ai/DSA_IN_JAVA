import java.util.Scanner;
public class Pro_23{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int sum = 5;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            sum = sum*2+1;
        }
    }
}