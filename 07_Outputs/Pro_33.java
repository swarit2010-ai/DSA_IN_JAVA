public class Pro_33 {

    public static void main(String[] args) {
        int a = 1, b = 10;
        for(int i = 1; i <= 4; i++) {
            if(i % 2 == 0)
                a += b;
            else
                b -= a;
        
            System.out.print(a + "," + b + " ");
        }
    }
}