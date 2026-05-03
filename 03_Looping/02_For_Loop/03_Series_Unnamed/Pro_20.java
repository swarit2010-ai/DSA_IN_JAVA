import java.util.Scanner;
public class Pro_20{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int x = 1;
        int y = 2;
        for(int m = 1;m <= n;m++){
            if(m % 2 == 1){
                System.out.println(x);
                x++;
            }
            else{
                System.out.println(y*y);
                y++;
            }
        }
    }
}