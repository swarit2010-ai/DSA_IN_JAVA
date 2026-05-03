public class Pro_08 {

    public static void main(String[] args) {
        int p = -1;
        int c = 1;
        for(int n = 1;n <= 25;n++){
            p += c;
            c += 2;
            System.out.println(p);
        }
    }
}