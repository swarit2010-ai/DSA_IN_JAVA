import java.util.Scanner;
public class Pro_27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int s = sc.nextInt();
        for(int i = 1;i <= s;i++){
            for(int a = 1;a <= (i-1);a++){
                System.out.print("  ");
            }
            for(int b = i;b <= s;b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}