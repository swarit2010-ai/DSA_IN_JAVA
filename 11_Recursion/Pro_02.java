// WAP to print 1 to n
public class Pro_02{
    // Normal method using two parameter :
    // public static void main(String[] args) {
    //     int i = 1,n = 15;
    //     print(i,n);
    // }
    // public static void print(int i,int n){
    //     System.out.println(i);
    //     if(i == n) return;
    //     print(i+1, n);
    // }
    // Mast method using one parameter with the help of global variable:
    // static int n = 15;
    // public static void main(String[] args) {
    //     int i = 1;
    //     print(i);
    // }
    // public static void print(int i){
    //     System.out.println(i);
    //     if(i == n) return;
    //     print(i+1);
    // }
    // Another method: The Magic Trick:
    public static void main(String[] args) {
        int n = 15;
        print(n);
    }
    public static void print(int i){
        if(i == 0) return;
        print(i-1);
        System.out.print(i + " ");
    }
}