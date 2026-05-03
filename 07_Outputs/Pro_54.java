public class Pro_54 {
    public static void main(String[] args) {
        int x = 5, y = 10;
        for (int i = 1; i <= 3; i++) {
            if (y / i > x) {
                x += i;
            } else {
                y -= i;
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}