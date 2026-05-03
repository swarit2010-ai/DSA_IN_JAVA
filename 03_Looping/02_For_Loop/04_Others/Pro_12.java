import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int s = 0;
        for(int n = 1;n <= no;n++){
            if(no % n == 0 && n % 2 == 0){
                s = s+n;
            }
        }
        System.out.println("The sum of its even factors is " + s);
    }
}