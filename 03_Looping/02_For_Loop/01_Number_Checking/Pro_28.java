import java.util.Scanner;
public class Pro_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        double no = sc.nextDouble();
        boolean check = false;
        int sum;
        outer:
            for(int i = 1;i <= no;i++){
                sum = i;
                if(sum > no)
                    break;
                for(int j = i+1;true;j++){
                    sum += j;
                    System.out.println(sum);
                    if(sum == no){
                        check = true;
                        break outer;
                    }
                    if(sum > no)
                        break; 
                }
            }
        if(check == true)
            System.out.println("It is a sum of consecutive integers number");
        else
            System.out.println("It is not a sum of consecutive integers number");
   }
}