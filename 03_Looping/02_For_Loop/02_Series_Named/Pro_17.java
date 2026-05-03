import java.util.Scanner;
public class Pro_17 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            double har;
            for(double m = 1;m <= n;m++){
                har = 1/m;
                if(m % 2 == 1){
                    System.out.println(har);
                }
                else
                    System.out.println(-har);
            }
        }
    }
}