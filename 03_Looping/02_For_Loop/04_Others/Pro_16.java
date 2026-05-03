public class Pro_16 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        for(int n = 1;n <= 1;){
            c = a+b;
            if(c >= 50 && c <=500){
            System.out.println(c);
            }
            if(c > 500 )
                break;
            a = b;
            b = c;
        }
    }
}