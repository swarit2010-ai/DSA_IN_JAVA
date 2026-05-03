public class Pro_09 {
    public static void main(String[] args) {
        int time = 6;
        int rounds;
        int time_2;
        for(int i = 1;i <= 7;i++){
            time_2 = Math.abs(time);
            rounds = (i > 4)? (i-time_2):i;
            for(int a = 1;a <= rounds;a++){
                System.out.print("*");
            }
            for(int b = 1;b <= time_2;b++){
                System.out.print(" ");
            }
            for(int b = 1;b <= rounds;b++){
                System.out.print("*");
            }
            System.out.println();
            time -= 2;
        }
    }
}
