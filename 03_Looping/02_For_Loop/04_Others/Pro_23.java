import java.util.Scanner;
public class Pro_23 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int count = 0;
        for(int n = 1;n >= 0;n++){
            no = no/10;
            if(no != 0){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println("The number is of " + (count+1) + " digits");
    }
}