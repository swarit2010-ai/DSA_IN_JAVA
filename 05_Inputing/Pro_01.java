import java.util.Scanner;
public class Pro_01{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int no,sum = 0;
            System.out.println("Enter twenty-five numbers :");
            for(int n = 1;n <= 25;n++){
                no = sc.nextInt();
                sum += no;
            }
            System.out.println("The sum is " + sum);
        }
    }
}