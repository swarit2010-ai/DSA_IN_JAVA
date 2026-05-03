// WAP to find the maximum and minimum of three numbers using Math function
import java.util.Scanner;
public class Pro_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The maximum is " + Math.max(c,Math.max(a,b)));
        System.out.println("The minimum is " + Math.min(c,Math.min(a,b)));
    }
}