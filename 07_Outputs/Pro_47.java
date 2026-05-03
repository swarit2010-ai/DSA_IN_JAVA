public class Pro_47 {
    public static void main(String[] args) {
        int x = 10;
        x -= x++ + --x + x * 2 + x % 5 - 8;
        System.out.println(x);
    }
}
