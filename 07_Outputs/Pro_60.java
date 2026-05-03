public class Pro_60 {
    public static void main(String[] args) {
        char ch = 'A';
        int val = 2;
        for (int i = 1; i <= 3; i++) {
            System.out.print(ch);
            ch += val;
            val++;
        }
        System.out.println();
        System.out.println(val);
    }
}