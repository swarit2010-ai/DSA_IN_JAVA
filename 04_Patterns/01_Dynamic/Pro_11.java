import java.util.Scanner;
public class Pro_11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int h = sc.nextInt();
        for(int i = 1;i <= h;i++){
            for(int j = 1;j <= i;j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}