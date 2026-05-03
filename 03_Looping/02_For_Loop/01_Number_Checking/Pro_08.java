import java.util.Scanner;
public class Pro_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = true;
        for(int i = 2;i*i <= no;i++){
            if(no % i*i == 0){
                check = false;
                break;
            }
        }
        if(check == true)
            System.out.println("It is a square free number");
        else
            System.out.println("It is not a square free number");
   }
}