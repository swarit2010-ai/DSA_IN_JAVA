import java.util.Scanner;
public class Pro_22 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number :");
            int no = sc.nextInt();
            System.out.println("Enter another number :");
            int no_1 = sc.nextInt();
            int quo = 0;
            int n;
            for(n = no;n >= no_1;n-=no_1){
                quo++;
            }
            
            System.out.println("The quotient is " + quo);
            System.out.println("The remainder is " + n);
        }
    }
}