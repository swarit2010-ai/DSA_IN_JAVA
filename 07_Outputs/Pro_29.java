public class Pro_29 {

    public static void main(String[] args) {
        int p = 1, q = 1, r;    
        for(int i = 1; i <= 4; i++) {
            r = p + q;
            p = q;
            q = r + i;
            System.out.print(p + " " + q + " | ");
        }
    }
}
