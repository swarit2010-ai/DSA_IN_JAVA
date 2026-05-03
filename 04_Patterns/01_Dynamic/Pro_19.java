import java.util.Scanner;
public class Pro_19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        int s = sc.nextInt();
        if(s % 2 == 0){
            System.out.println("Enter the odd number of sides");
        }
        else{
            for(int i = 1;i <= s;i++){
                for(int j = 1;j <= s;j++){
                    if(i == j || (i+j) == (s+1))
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}