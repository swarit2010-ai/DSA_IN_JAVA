public class Pro_18 {

    public static void main(String[] args) {
        int t_s = 0;
        int s = 0;
        for(int n = 1;n <= 20;n++){
            s += n;
            t_s += s; 
        }
        System.out.println(t_s);
    }
}