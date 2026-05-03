import java.util.Scanner;
public class Pro_07{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int no,odd = 0,even = 0,sum_odd = 0,sum_even = 0;
            System.out.println("Enter twenty-five numbers :");
            for(int n = 1;n <= 5;n++){
                no = sc.nextInt();
                if(no != 0){
                    if(no % 2 == 0){
                        even++;
                        sum_even += no;
                    }
                    else{
                    odd++;
                    sum_odd += no;
                    }
                }
            }
            if(even != 0){
                if(odd != 0){
                    System.out.println("The sum and average of even numbers are " + sum_even + " and " + (double)sum_even/even);
                    System.out.println("The sum and average of odd numbers are " + sum_odd + " and " + (double)sum_odd/odd);
                }
                else{
                    System.out.println("The sum and average of even numbers are " + sum_even + " and " + (double)sum_even/even);
                }
            }
            else if(odd != 0){
                System.out.println("The sum and average of odd numbers are " + sum_odd + " and " + (double)sum_odd/odd);
            }
            else{
                System.out.println("All numbers are zero");
            }
        }
    }
}