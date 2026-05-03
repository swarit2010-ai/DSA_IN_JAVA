public class Pro_59 {
    public static void main(String[] args) {
        int num = 4321, res = 0;
        while (num > 0) {
            int d = num % 10;
            if (d % 2 != 0) {
                res = res * 10 + d;
            }
            num /= 100;
        }
        System.out.println(res);
    }
}