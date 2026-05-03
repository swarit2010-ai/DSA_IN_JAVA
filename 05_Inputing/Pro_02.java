import java.util.Scanner;
public class Pro_02{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int no,sum_odd = 0,sum_even = 0;
            System.out.println("Enter twenty-five numbers :");
            for(int n = 1;n <= 25;n++){
                no = sc.nextInt();
                if(no % 2 == 0){
                    sum_even += no;
                }
                else{
                    sum_odd += no;
                }
            }
            System.out.println("The sum of odd numbers is " + sum_odd);
            System.out.println("The sum of even numbers is " + sum_even);
        }
    }
}