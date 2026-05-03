import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        System.out.println("Enter your percentage:");
        try (Scanner sc = new Scanner(System.in)){
            double no1 = sc.nextDouble();
            if(no1 > 90 && no1 <=100){
                System.out.println("You have obtained grade A");
            }
            else if(no1 >= 81 && no1 <= 90){
                System.out.println("You have obtained grade B");
            }
            else if (no1 >= 71 && no1 <= 80) {
                System.out.println("You have obtained grade C");
            }
            else if (no1 < 71) {
                System.out.println("You have obtained grade D");
            }
            else{
                System.out.println("Enter a valid percentage");
            }
        }
    }
}