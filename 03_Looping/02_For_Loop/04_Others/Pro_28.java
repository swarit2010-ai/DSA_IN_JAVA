import java.util.Random;
public class Pro_28 {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int n = 1;n > 0;n++){
            System.out.print(rand.nextInt(2));
        }
    }
}