// WAP to count the digits in a given number without for loop
import java.util.*;
public class Pro_07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        String s = Integer.toString(a);
        System.out.println("The no of digits are " + s.length());
    }
}