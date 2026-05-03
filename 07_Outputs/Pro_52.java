public class Pro_52 {
    public static void main(String[] args) {
        int n = 89271,d,p = 1,s = 0;
        while(n > 9){
            d = n % 10;
            if(d % 2 == 0)
                p *= d;
            s += d;
            n /= 10;
        }
        System.out.println(s);
        System.out.println(n);
        System.out.println(p);
    }
}
