import java.util.Scanner;
public class Pro_08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        int s = sc.nextInt();
        for(int i = 1;i <= s;i++){
            for(int j = 1;j <= s;j++){
                System.out.print((char)(i+96) + " ");
            }
            System.out.println();
        }
    }
}