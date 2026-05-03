import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int sq;
        if(no >= 0){
            for(int i = 0;true;i++){
                sq = i*i;
                if(sq == no){
                    check = true;
                    break;
                }
                else if(sq > no)
                    break;
            }
        }
        if(check == true)
            System.out.println("It is a perfect square number");
        else
            System.out.println("It is not a perfect square number");
   }
}