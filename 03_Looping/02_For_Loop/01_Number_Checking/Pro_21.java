import java.util.Scanner;
public class Pro_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int a = -1;
        int b = 1;
        int f = 0;
        for(;f <= no;){
            f = a+b;
            if(f == no){
                check = true;
                break;
            }
            a = b;
            b = f;
        }
        if(check == true)
            System.out.println("It is a fibonacci number");
        else
            System.out.println("It is not a fibonacci number");
   }
}