import java.util.Scanner;
public class Pro_02 {
    static Scanner sc = new Scanner(System.in);
    static int digits;
    static double otp;
    public static void main(String[] args) {
        System.out.println("Enter number of digits");
        input();
        print();
    }
    static void input(){
        digits = sc.nextInt();
    }
    static void print(){
        int int_otp = (int)otp();
        String format_otp = String.format("%0" + digits + "d", int_otp);
        System.out.println("The desired otp is " + format_otp);
    }
    static double otp(){
        otp = Math.random();
        for(int n = 1;n <= digits;n++){
            otp*=10;
        }
        return otp;
    }
}