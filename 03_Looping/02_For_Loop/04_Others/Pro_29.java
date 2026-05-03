import java.util.Scanner;
public class Pro_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int fno = 0;
        for(int n = 2;n < no;n++){
            for(int m = 1;m <= n;m++){
                if(n % m == 0){
                    fno++;
                }
            }
            if(fno == 2){
                System.out.println(n);
            }
            fno = 0;
        }
   }
}