public class Pro_15 {
    public static void main(String[] args) {
        int spaces = 6;
        int times = 1;
        int small = 0;
        for(int i = 1;i <= 4;i++){
            for(int a = 1;a <= spaces;a++){
                System.out.print(" ");
            }
            spaces -= 2;
            for(int b = 1;b <= times;b++){
                if(b > i && b < (i+small))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            small += 2;
            times += 4;
            System.out.println();
        }
        
    }
}
