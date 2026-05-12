package OOPS;

public class MethodOverloading {
    public static int max(int a,int b,int c){ // 1st method
        return Math.max(a,Math.max(b,c));
    }
    public static int max(int a,int b){ // 2nd method
        return Math.max(a,b);
    }
    public static void main(String[] args) {
        System.out.println(max(5,3));// Corresponds to 2nd method
        System.out.println(max(5,3,9));// Corresponds to 1st method
    }
}
