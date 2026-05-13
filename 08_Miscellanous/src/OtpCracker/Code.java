/*
Create an otp cracker after generating it
(maximum 9 digits)
[Using Binary Search]
 */
package OtpCracker;

public class Code {
    static int crack(int otp) {
        int low = 0,high = 999999999,mid;
        while(low<=high){
            mid = low+(high-low)/2;
            if(mid == otp) return mid;
            else if(mid > otp) high = mid-1;
            else low = mid+1;
            System.out.println(mid);
        }
        return -1;
    }
    public static void main(String[] args) {
        int otp = OtpGenerator.Code.generate();
        System.out.println("The Generated otp is " + otp);
        System.out.println("Starting to crack otp :");
        System.out.println(crack(otp) + " is the cracked otp");
    }
}
