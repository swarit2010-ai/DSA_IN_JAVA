public class Pro_15 {
    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        for(int i = 1;i <=2;i++){
            for(int a = start;a <= end;a++){
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.println();
            for(int b = end + 5;b >= start + 5;b--){
                System.out.print(b);
                System.out.print(" ");
            }
            System.out.println();
            start += 10;
            end += 10;
        }
    }
}
