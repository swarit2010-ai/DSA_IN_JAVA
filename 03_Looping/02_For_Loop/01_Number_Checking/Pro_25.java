import java.util.Scanner;
public class Pro_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        double no = sc.nextDouble();
        boolean check = false;
        double p;
        double f1 = 1,f2 = 1,f3 = 1;
        for(int i = 1;i <= no;i++){
            for(double a = 1;a <= 2*i;a++)
                f1 *= a;
            for(double b = 1;b <= i+1;b++)
                f2 *= b;
            for(double c = 1;c <= i;c++)
                f3*= c;
            p = f1/(f2*f3);
            if(p == no){
                check = true;
                break;
            }
            if(p > no)
                break;
            f1 = 1;
            f2 = 1;
            f3 = 1;
        }
        if(check == true)
            System.out.println("It is a catalan number");
        else
            System.out.println("It is not a catalan number");
   }
}