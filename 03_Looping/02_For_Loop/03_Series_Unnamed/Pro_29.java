import java.util.Scanner;
public class Pro_29{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int p = 1;
        for(int m = 1;m <= n;m++){
            if(p % 3 == 0){
                p++;
            }
            System.out.println(p*p);
            p++;
        }
    }
} 