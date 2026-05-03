import java.util.Scanner;
public class Pro_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int p;
        outer:
            for(int i = 2;i <= no/2;i++){
                for(int j = 2;true;j++){
                    p = (int)Math.pow(i,j);
                    if(p == no){
                        check = true;
                        break outer;
                    }
                    else if(p > no)
                        break;
                }

            }
        if(check == true)
            System.out.println("It is a power of n number");
        else
            System.out.println("It is not a power of n number");
   }
}