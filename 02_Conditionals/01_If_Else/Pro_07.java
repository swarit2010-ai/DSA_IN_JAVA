import java.util.Scanner;
public class Pro_07 {
    public static void main(String[] args) {
        System.out.println("Enter a side:");
        try (Scanner sc = new Scanner(System.in)) {
            int s1 = sc.nextInt();
            System.out.println("Enter another side :");
            int s2 = sc.nextInt();
            System.out.println("Enter the third side :");
            int s3 = sc.nextInt();
            if(s1 == s2){
                if(s1 == s3){
                    System.out.println("The triangle is equilateral triangle");
                }
                else{
                    System.out.println("The triangle is isosceles triangle");
                }
            }
            else if(s1 == s3){
                System.out.println("The triangle is isosceles triangle");
            }
            else if(s2 == s3){
                System.out.println("The triangle is isosceles triangle");
            }
            else{
                System.out.println("The triangle is scalane triangle");
            }
        }
    }
}