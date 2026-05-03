import java.util.Scanner;
public class Pro_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        double rec;
        for(int m = 1;m <= n;m++){
            rec = 1.0/m;
            System.out.println(rec);
        }
    }
}