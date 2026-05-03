import java.util.Scanner;
public class Pro_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int p;
        for(int i = 1;true;i++){
            p = (int)Math.pow(2,i);
            if(p == no){
                check = true;
                break;
            }
            else if(p > no)
                break;
        }
        if(check == true)
            System.out.println("It is a power of 2 number");
        else
            System.out.println("It is not a power of 2 number");
   }
}