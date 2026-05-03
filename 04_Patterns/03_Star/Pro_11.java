public class Pro_11 {

    public static void main(String[] args) {
        int spaces,stars;
        for(int i = 1;i <= 5;i++){
            spaces = Math.abs(3 - i);
            stars = 5 - spaces*2;
            for(int a = 1;a <= spaces;a++){
                System.out.print(" ");
            }
            for(int b = 1;b <= stars;b++){
                if(b == 1 || b == stars)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}