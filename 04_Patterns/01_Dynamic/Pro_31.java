import java.util.Scanner;
public class Pro_31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        int s = sc.nextInt();
        int a,b;
        for(int i = 1;i <= s*2-1;i++){
            for(int j = 1;j <= s*2-1;j++){
                a = i;
                b = j;
                if(i > s) 
                    a = 2*s - i;
                if(j > s) 
                    b = 2*s - j;
                System.out.print(Math.min(a,b) + " ");
            }
            System.out.println();
        }
    }
}