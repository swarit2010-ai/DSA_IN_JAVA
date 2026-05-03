import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int cb;
        for(int i = 0;true;i++){
            cb = i*i*i;
            if(cb == no){
                check = true;
                break;
            }
            else if(cb > no)
                break;
        }
        if(check == true)
            System.out.println("It is a perfect cube number");
        else
            System.out.println("It is not a perfect cube number");
   }
}