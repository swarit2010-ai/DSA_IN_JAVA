import java.util.Scanner;
public class Pro_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        double ans = 2;
        for(int m = 1;m <= n;m++){
            System.out.println(ans);
            if(m % 2 == 1){
                ans *= 3;
            }
            else{
                ans /= 2;
            }
        }
    }
}