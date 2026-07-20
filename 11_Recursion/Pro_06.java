// WAP to print a raised to b
public class Pro_06{
    // My Jugadu method :
    // static int ans = 1;
    // public static void main(String[] args) {
    //     int a = 3;
    //     int b = 3;
    //     System.out.println(quickExponents(a, b));
    // }
    // static int quickExponents(int a, int b) {
    //     // Write your code here
    //     expo(a,b);
    //     return ans;
    // }
    // static void expo(int a,int b){
    //     if(b == 0) return;
    //     ans *= a;
    //     expo(a,--b);
    // }
    // Bhaiya's method : With formula
    // public static void main(String[] args) {
    //     int a = 4,b = 3;
    //     System.out.println(expo(a, b));
    // }
    // public static int expo(int a,int b){
    //     if(b == 0) return 1;
    //     return a*(expo(a, b-1));
    // }
    // Best method : Logarithmic time complexity
    public static void main(String[] args) {
        int a = 6,b = 3;
        System.out.println(expo(a, b));
    }
    public static int expo(int a,int b){
        if(b == 0) return 1;
        int ans = (expo(a, b/2));
        if(b % 2 == 0) return ans*ans;
        else return a*(expo(a,b-1));
    }
}