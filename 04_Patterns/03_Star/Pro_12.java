public class Pro_12 {
    public static void main(String[] args) {
        int stars = 7;
        int spaces = 0;
        for(int i = 1;i <= 7;i++){
            for(int a = 1;a <= spaces;a++){
                System.out.print(" ");
            }
            for(int b = 1;b <= stars;b++){
                System.out.print("*");
            }
            if(i < 4){
                spaces++;
                stars -= 2;
            }
            else{
                spaces--;
                stars += 2;
            }
            System.out.println();
        }
    }
}