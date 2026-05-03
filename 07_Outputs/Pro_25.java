public class Pro_25 {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        for(int i = 1; i <= 3; i++) {
            a = a + b;
            b = b + c;
        
            for(int j = 1; j <= i; j++) {
                c = a + b + c;
                System.out.print(a + "," + b + "," + c + "  ");
                a++;
            }
        
            System.out.println();
        }
    }
}