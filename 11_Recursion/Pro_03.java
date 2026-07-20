// WAP to print 1 to n then n to 1
public class Pro_03{
    static int n = 5;
    public static void main(String[] args) {
        int i = 1;
        print(i);
    }
    static void print(int i){
        if(i > n) return;
        System.out.print(i + " ");
        print(i+1);
        System.out.print(i + " ");
    }
}