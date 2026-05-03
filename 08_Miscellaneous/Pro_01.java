import java.util.Scanner;
public class Pro_01 {
    static Scanner sc = new Scanner(System.in);
    static int denominations[] = {500,200,100,50,20,10,5,2,1};
    static int n,amount;
    public static void main(String[] args) {
        System.out.println("Enter the amount :");
        int original_amount = input();
        amount = original_amount;
        System.out.println("The amount " + original_amount + " rupees can be divided into :");
        int count_var;
        for(n = 0;n <= denominations.length - 1;n++) {
            count_var = count();
            System.out.println("The no of " + denominations[n] + " notes is " + count_var);
            amount = amount-denominations[n]*count_var;
        }
    }
    static int input(){
        return sc.nextInt();
    }
    static int count(){
        return amount/denominations[n];
    }
}