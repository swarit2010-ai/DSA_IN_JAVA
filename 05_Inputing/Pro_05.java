import java.util.Scanner;
public class Pro_05{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int no,small_no;
            System.out.println("Enter twenty-five numbers :");
            no = sc.nextInt();
            small_no = no;
            for(int n = 1;n <= 4;n++){
                no = sc.nextInt();
                if(no < small_no){
                    small_no = no;
                }
            }
            System.out.println("The smallest no is " + small_no);
        }
    }
}