// WAP to create your own compare to method
import java.util.*;
public class Pro_05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which will be compared :");
        String s1 = sc.nextLine();
        System.out.println("Enter the string to which it will be compared :");
        String s2 = sc.nextLine();
        for(int i = 0;i < Math.min(s1.length(),s2.length());i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(ch1 != ch2){
                System.out.println(ch1-ch2);
                System.exit(0);
            }
        }
        System.out.println(s1.length()-s2.length());
    }
}