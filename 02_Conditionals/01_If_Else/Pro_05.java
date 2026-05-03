import java.util.Scanner;
public class Pro_05 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int no = sc.nextInt();
            System.out.println("Enter another number");
            int no2 = sc.nextInt();
            if(no > no2){
                System.out.println(no + " is the largest number");
            }
            else{
                System.out.println(no2 + " is the largest number");
            }
        }
        
    }
}