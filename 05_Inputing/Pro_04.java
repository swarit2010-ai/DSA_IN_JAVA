import java.util.Scanner;
public class Pro_04{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int no,large_no;
            System.out.println("Enter twenty-five numbers :");
            no = sc.nextInt();
            large_no = no;
            for(int n = 1;n <= 24;n++){
                no = sc.nextInt();
                if(no > large_no){
                    large_no = no;
                }
            }
            System.out.println("The largest no is " + large_no);
        }
    }
}