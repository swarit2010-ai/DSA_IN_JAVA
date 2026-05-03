import java.util.Scanner;
public class Pro_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int p;
        int fact = 0;
        for(int i = 1;i <= no;i++){
            for(int j = 1;j <= i;j++){
                if(i % j == 0)
                    fact++;
            }
            if(fact == 2){
                p = i*i*i;
                if(p == no){
                    check = true;
                    break;
                }
            }
            fact = 0;
        }
        if(check == true)
            System.out.println("It is a cube of a prime number");
        else
            System.out.println("It is not a cube of a prime number");
   }
}