import java.util.Scanner;
public class Pro_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number");
            int x = sc.nextInt();
            int p;
            for(int n = 1;n <= 25;n++){
                p = (int)Math.pow(x,n);
                System.out.println(p);
            }
        }
    }
}