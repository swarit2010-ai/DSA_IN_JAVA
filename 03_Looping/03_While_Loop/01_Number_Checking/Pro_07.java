import java.util.Scanner;
public class Pro_07{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            String s = sc.next();
            int n = Integer.parseInt(s);
            int d;
            boolean check = false;
            System.out.println(s);
            if(s.charAt(0) != '0'){
                while(n != 0){
                    d = n % 10;
                    if(d == 0){
                        check = true;
                        break;
                    }
                    n /= 10;
                }
            }
            if(check == false){
                System.out.println("The number is not a duck number");
            }
            else{
                System.out.println("The number is a duck number");
            }
        }
    }
}