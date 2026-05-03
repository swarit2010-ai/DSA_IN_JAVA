import java.util.Scanner;
public class Pro_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int c = 0;
        int fact = 0;
        int cp = no;
        for(int i = 2;i < no;i++){
            for(int j = 1;j <= i;j++){
                if(i % j == 0)
                    fact++;
            }
            if(fact == 2){
                while(cp % i == 0){
                    c++;
                    cp /= i;
                }
            }
            fact = 0;
        }
        if(c == 2)
            System.out.println("It is a semi prime number");
        else
            System.out.println("It is not a semi prime number");
   }
}