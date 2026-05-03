import java.util.Scanner;
public class Pro_30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int s = sc.nextInt();
        int stars = 4;
        int spaces = 1;
        for(int x = 1;x <= s*2-1;x++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i = 1;i <= s-1;i++){
            for(int a = 1;a <= stars;a++){
                System.out.print("* ");
            }
            for(int b = 1;b <= spaces;b++){
                System.out.print("  ");
            }
            for(int c = 1;c <= stars;c++){
                System.out.print("* ");
            }
            stars--;
            spaces += 2;
            System.out.println();
        }
    }
}