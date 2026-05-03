public class Pro_36 {
    public static void main(String[] args) {
        int a = 0, i = 4;
        while (i < 10) {
            a = ++i - i*2;
        }
        System.out.println("a = " + a + ", i = " + i);
    }
}
