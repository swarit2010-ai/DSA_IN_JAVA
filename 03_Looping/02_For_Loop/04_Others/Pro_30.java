import java.util.Scanner;
public class Pro_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        System.out.println("Enter another number :");
        int no2 = sc.nextInt();
        int no3 = no;
        int no4 = no2;
        int hcf = 1,lcm = 1;
        int max = Math.max(no,no2);
        for(int n = 2;n <= max;n++){
            while(no % n == 0 && no2 % n == 0){
                hcf *= n;
                no /= n;
                no2 /= n;
            }
            while (true) { 
                if(no3 % n == 0 && no4 % n == 0){
                    lcm *= n;
                    no3 /= n;
                    no4 /= n;
                }  
                else if(no3 % n == 0){
                    lcm *= n;
                    no3 /= n;
                
                } 
                else if(no4 % n == 0){
                    lcm *= n;
                    no4 /= n;
                }
                else{
                    break;
                }
            }
        }
        System.out.println("The highest common factor is " + hcf);
        System.out.println("The least common multiple is " + lcm);
   }
}