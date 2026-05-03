public class Pro_25 {
    public static void main(String[] args) {
        int sq;
        for(int n = 1;n <= 1000;n++){
            sq = n*n;
            if(sq % 10 == 1){
                System.out.println(n);
            }
        }
    }
}