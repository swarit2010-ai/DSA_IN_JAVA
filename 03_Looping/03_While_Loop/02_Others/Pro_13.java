import java.util.Scanner;
public class Pro_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int cp = n,d = 0;
            int no_of_d = 0;
            while(n != 0){
                no_of_d++;
                n /= 10;
            }
            if(no_of_d % 2 == 0){
                System.out.println("No middle digit present");
            }
            else{
                for(int m = 1;m <= no_of_d/2+1 ;m++){
                    d = cp % 10;
                    cp /= 10;
                }
                System.out.println("The middle digit is " + d);
            }
        }
    }
}
