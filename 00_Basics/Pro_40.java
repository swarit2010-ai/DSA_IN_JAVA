import java.util.Scanner;
public class Pro_40 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the seconds :");
            int sec = sc.nextInt();
            int hr = sec/3600;
            int remain_sec = sec - hr * 3600;
            int min = remain_sec / 60;
            int left_sec = sec - (hr * 3600 + min * 60);
            System.out.println("The time " + sec + " seconds can be divided into " + hr + " hours , " + min + " minutes and " + left_sec + " seconds");
        }
    }
}