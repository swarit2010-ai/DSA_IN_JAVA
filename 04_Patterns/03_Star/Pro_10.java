public class Pro_10 {

    public static void main(String[] args) {
        int spaces,stars;
        for(int i = 1;i <= 7;i++){
            spaces = Math.abs(4 - i);
            stars = 7 - spaces*2;
            for(int a = 1;a <= spaces;a++){
                System.out.print(" ");
            }
            for(int b = 1;b <= stars;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}