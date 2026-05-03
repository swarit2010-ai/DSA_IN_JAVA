import java.util.Scanner;
public class Pro_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        double no = sc.nextDouble();
        boolean check = false;
        double p;
        for(int i = 1;i <= no;i++){
            p = (int)Math.pow(2,i) - 1;
            if(p == no){
                check = true;
                break;
            }
            if(p > no)
                break;
        }
        if(check == true)
            System.out.println("It is a mersenne number");
        else
            System.out.println("It is not a mersenne number");
   }
}