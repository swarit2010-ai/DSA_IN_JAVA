import java.util.Scanner;
public class Pro_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        System.out.println("Enter another number :");
        int no2 = sc.nextInt();
        int hcf = 1;
        int min = Math.min(no,no2);
        for(int n = 2;n <= min;n++){
            while(no % n == 0 && no2 % n == 0){
                hcf *= n;
                no /= n;
                no2 /= n;
            }
        }
        if(hcf == 1)
            System.out.println("These are co prime numbers");
        else
            System.out.println("These are not co prime numbers");
   }
}