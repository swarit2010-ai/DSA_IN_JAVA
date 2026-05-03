import java.util.Scanner;
public class Pro_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int p;
        for(int i = 1;i <= no;i++){
            p = i*(2*i-1);
            if(p == no){
                check = true;
                break;
            }
            if(p > no)
                break;
        }
        if(check == true)
            System.out.println("It is a hexagonal number");
        else
            System.out.println("It is not a hexagonal number");
   }
}