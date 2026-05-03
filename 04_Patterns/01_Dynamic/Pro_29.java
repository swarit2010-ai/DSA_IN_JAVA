import java.util.Scanner;
public class Pro_29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int s = sc.nextInt();
        int stars = 1;
        int spaces = s-1;
        for(int i = 1;i <= s*2-1;i++){
            for(int a = 1;a <= spaces;a++){
                System.out.print("  ");
            }
            for(int b = 1;b <= stars;b++){
                System.out.print("* ");
            }
            System.out.println();
            if(i < s){
                stars += 2;
                spaces--;
            }
            else{
                stars -= 2;
                spaces++;
            }
        }
    }
}