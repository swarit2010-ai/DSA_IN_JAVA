/*
WAP to input a number of digits from the user and display
 the otp according to the user’s
 given number of digits (maximum 9 digits)
 */
package OtpGenerator;
import java.util.*;
public class Code {
    public static int generate(){
        Random r = new Random();
        System.out.println("Enter the number of digits :");
        int d = RupeeDistinguisher.Code.input();
        int max = max(d),min = min(d);
        return r.nextInt(max - min + 1) + min;
    }
    static int min(int d){
        return (int)Math.pow(10,d-1);
    }
    static int max(int d){
        int max = 0;
        for(int i = 1;i <= d;i++) max=max*10+9;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("The generated otp is "+generate());
    }
}
