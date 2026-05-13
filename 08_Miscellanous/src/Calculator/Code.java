// WAP to create a basic console based Calculator which does +,-,*,/,% and e to exit or c to clear
package Calculator;

import java.util.*;

public class Code {
    static Scanner sc = new Scanner(System.in);
    static int input(){
        return sc.nextInt();
    }
    static void calculate(){
        System.out.println("Enter the number and the operator to do operations :");
        char ch = 'a';
        int n = input();
        int ans = n;
        while(true){
            ch = sc.next().charAt(0);
            if(ch == 'e') return;
            if(ch == 'c') break;
            n = input();
            switch (ch){
                case '+': ans+=n;break;
                case '-': ans-=n;break;
                case '*': ans*=n;break;
                case '/': ans/=n;break;
                case '%': ans%=n;break;
                default:
                    System.out.println("Wrong operator");
            }
            System.out.println(ans);
        }
        calculate();
    }

    public static void main(String[] args) {
        calculate();
        System.out.println("Exited.Type c to calculate or e to exit");
        char ch = sc.next().charAt(0);
        if(ch == 'e') System.exit(0);
        if(ch == 'c') calculate();
    }
}
