import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number");
            int a = sc.nextInt();
            int s = 1,p;
            for(int n = 1;n <= 25;n++){
                p = (int)Math.pow(a,s);
                System.out.println(p);
                s += 2;
            }
        }
    }
}