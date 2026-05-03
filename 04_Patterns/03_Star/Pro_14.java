public class Pro_14 {
    public static void main(String[] args) {
        int red = 4;
        for(int i = 1; i<= 9;i++){
            if(i <= 5){
                for(int a = 1; a <= i;a++){
                    System.out.print("*");
                }
            }
            else{
                for(int a = 1;a <= red;a++){
                    System.out.print("*");
                }
                red--;
            }
            System.out.println();
        }
    }
}