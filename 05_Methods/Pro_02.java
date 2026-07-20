// WAP to find the maximum and minimum of four numbers using Math function
import java.util.Scanner;
public class Pro_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("The maximum is " + Math.max(Math.max(c,d),Math.max(a,b)));
        System.out.println("The minimum is " + Math.min(Math.min(c,d),Math.min(a,b)));
    }
}