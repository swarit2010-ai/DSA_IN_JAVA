import java.util.Scanner;
public class Pro_06{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int no,pro = 1;
            System.out.println("Enter twenty-five numbers :");
            for(int n = 1;n <= 25;n++){
                no = sc.nextInt();
                if(no % 7 == 0){
                    pro *= no;
                }
            }
            if(pro == 1){
                System.out.println("There were no numbers divisible by 7");
            }
            else{
                System.out.println("The product of the numbers divisible by 7 is " + pro);
            }
        }
    }
}