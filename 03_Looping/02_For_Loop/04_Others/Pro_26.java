public class Pro_26 {
    public static void main(String[] args) {
        int sq;
        for(int n = 1;n <= 1000;n++){
            sq = n*n*n;
            if(sq % 10 == 3){
                System.out.println(n);
            }
        }
    }
}