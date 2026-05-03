public class Pro_51 {
    public static void main(String[] args) {
        int i,n = 12,c = 0,s = 0;
        for(i = 2;i <= n;i++){
            if(n % i == 0)
                s = s+i;
            c = c+2;
        }
        System.out.println(s);
        System.out.println(c);
        System.out.println(i);
    }
}
