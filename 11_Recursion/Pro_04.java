// WAP to print factorial of n
public class Pro_04{
    public static void main(String[] args) {
    }
    int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        return n*factorial(n-1);
    }
}