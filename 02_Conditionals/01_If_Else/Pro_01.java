import java.util.Scanner;
public class Pro_01 {
    public static void main(String[] args) {
        System.out.println("Enter an integer :");
        try (Scanner sc = new Scanner(System.in)) {
            int no = sc.nextInt();
            if(no % 2 == 0){
                System.out.println("The no. is even");
            }
            else{
                System.out.println("The no. is odd");
            }
        }
    }
}