public class Pro_19 {
    public static void main(String[] args) {
        int s = 0;
        for(int n = 1;n <= 100;n++){
            for(int m = 1;m <= n;m++){
                if(n % m == 0){
                    s = s+m;
                }
            }
            if((s-n) == n && n % 2 == 0){
                System.out.println(n);
            }
            s = 0;
        }
    }
}
