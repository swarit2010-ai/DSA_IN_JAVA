public class Pro_14 {
    public static void main(String[] args) {
        int f = 0;
        for(int n = 100;n <= 999;n++){
            for(int n2 = 1;n2 <= n;n2++){
                if(n % n2 == 0){
                    f++;
                }
            }
            if(f == 2){
                System.out.println(n);
            }
            f = 0;
        }
    }
}