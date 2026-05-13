package PasswordGenerator;
/*
Generate password which contains alphabets,numbers and @ , _ only
 */
import java.util.*;
public class Code {
    public static String generate(){
        Random r = new Random();
        String possible = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String pass = "";
        System.out.println("Enter the number of characters :");
        int d = RupeeDistinguisher.Code.input();
        for(int i = 1;i <= d;i++){
            int idx = r.nextInt(possible.length()-1);
            pass+=possible.charAt(idx);
        }
        return pass;
    }

    public static void main(String[] args) {
        System.out.println(generate());
    }
}
