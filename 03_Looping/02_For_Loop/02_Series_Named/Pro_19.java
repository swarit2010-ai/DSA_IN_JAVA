import java.util.Scanner;
public class Pro_19 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the terms :");
            int n = sc.nextInt();
            for(int m = 1;m <= n;m++){
                for(int j = 1;j <= m;j++){
                    System.out.print(j);
                    if(j != m){
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            }
        }
    }
}