import java.util.Scanner;
public class Pro_24 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            for(int m = 1;m <= n;m++){
                if(m == 3)
                    System.out.println(m*2);
                else
                    System.out.println(m*m);
            }
        }
    }
}