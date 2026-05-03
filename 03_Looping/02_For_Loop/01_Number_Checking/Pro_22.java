import java.util.Scanner;
public class Pro_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int p;
        for(int i = 1;i <= no;i++){
            p = i*(i+1)/2;
            if(p == no){
                check = true;
                break;
            }
            if(p > no)
                break;
        }
        if(check == true)
            System.out.println("It is a triangular number");
        else
            System.out.println("It is not a triangularr number");
   }
}