/*
WAP to input a number and display it in words
( 123 –  one , two , three)
[maximum 9 digits number]
 */
package NumberinWords01;
public class Code {
    static void words(){
        String words[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.println("Enter a number");
        int n = RupeeDistinguisher.Code.input();
        String ans = "";
        while(n != 0){
            int d = n%10;
            ans = words[d]+ans;
            n/=10;
        }
        System.out.println("The number in words is " + ans);
    }
    public static void main(String[] args) {
        words();
    }
}
