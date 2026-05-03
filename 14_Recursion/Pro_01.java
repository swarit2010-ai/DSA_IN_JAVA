// WAP to print n to 1
public class Pro_01{
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int i){
        if(i == 0) return;
        System.out.println(i);
        print(i-1);
    }
}