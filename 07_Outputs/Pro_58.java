public class Pro_58 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) continue;
            if (i > 7) break;
            s += i;
        }
        System.out.println(s);
    }
}