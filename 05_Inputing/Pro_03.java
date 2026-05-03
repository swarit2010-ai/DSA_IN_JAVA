import java.util.Scanner;
public class Pro_03{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int no,plus = 0,minus = 0,zero = 0;
            System.out.println("Enter twenty-five numbers :");
            for(int n = 1;n <= 25;n++){
                no = sc.nextInt();
                if(no > 0){
                    plus++;
                }
                else if(no < 0){
                    minus++;
                }
                else{
                    zero++;
                }
            }
            System.out.println("The frequency of + is " + plus);
            System.out.println("The frequency of - is " + minus);
            System.out.println("The frequency of 0 is " + zero);
        }
    }
}