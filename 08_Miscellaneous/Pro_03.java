import java.util.Scanner;
public class Pro_03{
    static Scanner sc = new Scanner(System.in);
    static int number,number3;
    static String word;
    static String[] words = {"one","two","three","four","five","six","seven","eight","nine","zero"};
    public static void main(String[] args) {
        System.out.println("Enter a positive number or zero :");
        input();
        if(number != 0){
            number3 = number;
            print();
        }
        else{
            System.out.println("zero");
        }
    }
    static void input(){
        number = sc.nextInt();
    }
    static void print(){
        System.out.print("The number " + number + " in words is ");
        for(int n = 1;n <= digits(number);n++){
            if(n != digits(number)){
                System.out.print(words());
                System.out.print(" , ");
            }
            else{
                System.out.print(words() + ".");
            }
        }
    }
    static String words(){
        switch (first_digit(number3)) {
            case 1 -> word = words[0];
            case 2 -> word = words[1];
            case 3 -> word = words[2];
            case 4 -> word = words[3];
            case 5 -> word = words[4];
            case 6 -> word = words[5];
            case 7 -> word = words[6];
            case 8 -> word = words[7];
            case 9 -> word = words[8];
            case 0 -> word = words[9];
            default -> {}
        }
        number3 = change_in_value(number3);
        return word;
    }
    static int digits(int any_number){
        int digits = 0;
        while (any_number != 0) { 
            digits++;
            any_number/=10;
        }
        return digits;
    }
    static int first_digit(int any_number2){
        int first_digit = any_number2/divisible_value(any_number2);
        return first_digit;
    }
    static int divisible_value(int any_number3){
        int divisible_value = 1;
        for(int p = 1;p < digits(any_number3);p++){
            divisible_value*=10;
        }
        return divisible_value;
    }
    static int change_in_value(int change_number){
        change_number %= divisible_value(change_number);
        return change_number;
    }
}