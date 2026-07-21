import java.util.Scanner;
public class Pro_55 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total seconds: ");
            long totalSec = sc.nextLong();
            long days = totalSec / (24 * 3600);
            totalSec %= (24 * 3600);
            long hours = totalSec / 3600;
            totalSec %= 3600;
            long minutes = totalSec / 60;
            long seconds = totalSec % 60;
            System.out.println(days + " Days, " + hours + " Hours, " + minutes + " Minutes, " + seconds + " Seconds");
        }
    }
}