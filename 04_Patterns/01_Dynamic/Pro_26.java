import java.util.Scanner;
public class Pro_26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        int s = sc.nextInt();
        for(int i = 1;i <= s;i++){
            for(int a = i;a <= (s-1);a++){
                System.out.print("  ");
            }
            for(int b = 1;b <= s;b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}