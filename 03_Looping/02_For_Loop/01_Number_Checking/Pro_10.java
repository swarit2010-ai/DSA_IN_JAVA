import java.util.Scanner;
public class Pro_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int c = 0;
        int fact = 0;
        int cp = no;
        int real_c = 0;
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
            if(c == 1)
                real_c++;
            fact = 0;
            c = 0;
        }
        if(real_c == 3)
            System.out.println("It is a sphenic number");
        else
            System.out.println("It is not a sphenic number");
   }
}