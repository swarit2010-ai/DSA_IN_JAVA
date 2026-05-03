import java.util.Scanner;
public class Pro_24{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int sum = 1;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            sum += m;
        }
    }
}