import java.util.Scanner;
public class Pro_24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int s = sc.nextInt();
        for(int i = 1;i <= s;i++){
            for(int a = i;a <= (s-1);a++){
                System.out.print("  ");
            }
            for(int b = 1;b <= i;b++){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}