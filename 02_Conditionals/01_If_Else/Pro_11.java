import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)){
            double no1 = sc.nextDouble();
            int in_no = (int)no1;
            double no2 = no1 - in_no;
            if(no2 >= 0.5){
                System.out.println("The rounded off number is " + (in_no+1));
            }
            else{
                System.out.println("The rounded off number is " + in_no);
            }
        }
    }
}