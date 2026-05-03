import java.util.Scanner;
public class Pro_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int p;
        int fact = 0;
        for(int i = 1;i <= (int)Math.sqrt(no);i++){
            for(int j = 1;j <= i;j++){
                if(i % j == 0)
                    fact++;
            }
            if(fact == 2){
                p = i*i;
                if(p == no){
                    check = true;
                    break;
                }
            }
            fact = 0;
        }
        if(check == true)
            System.out.println("It is a square of a prime number");
        else
            System.out.println("It is not a square of a prime number");
   }
}