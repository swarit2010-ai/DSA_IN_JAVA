import java.util.Scanner;
public class Pro_09 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int no1 = sc.nextInt();
            System.out.println("Enter another number :");
            int no2 = sc.nextInt();
            System.out.println("Enter the third number :");
            int no3 = sc.nextInt();
            if(no1 > no2){
                if(no1 > no3){
                    System.out.println(no1 + " is the largest number");
                }
                else{
                    System.out.println(no3 + " is the largest number");
                }
            }
            else if(no2 > no3){
                System.out.println(no2 + " is the largest number");
            }
            else{
                System.out.println(no3 + " is the largest number");
            }
        }
    }
}