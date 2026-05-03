import java.util.Scanner;
public class Pro_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int facto = 1;
        for(int i = 1;i <= no;i++){
            facto *= i;
            if(facto == no){
                check = true;
                break;
            }
            if(facto > no)
                break;
        }
        if(check == true)
            System.out.println("It is a factorial number");
        else
            System.out.println("It is not a factoriall number");
   }
}