public class Pro_15 {
    public static void main(String[] args) {
        int s = 0;
        for(int n = 100;n <= 999;n++){
            for(int n2 = 1;n2 <= n;n2++){
                if(n % n2 == 0){
                    s = s+n2;
                }
            }
            if((s-n) == n){
                System.out.println(n);
            }
            s = 0;
        }
    }
}