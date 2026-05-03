public class Pro_50 {
    public static void main(String[] args) {
        int x = 12;//11,10,12

        if (x++ == 11)
            System.out.println("Result is 11");
        else if (++x == 10)
            System.out.println("Result is 10");
        else if (--x == 10)
            System.out.println("Result is 10");
        else
            System.out.println("None");
    }
}
