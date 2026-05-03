import java.util.Scanner;
public class Pro_27{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int x = -1;
        int sum = 1;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            if(m % 2 == 1){
                sum = sum*2-x;
                x = x+3;
            }
            else{
                sum *= 2;
            }
        }
    }
} 