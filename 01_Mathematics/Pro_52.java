import java.util.Scanner;
public class Pro_52 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a three digit number");
            int no = sc.nextInt();
            int sum = 0;
            int pro = 1;
            int d;
            while(no != 0){
                d = no % 10;
                sum += d;
                pro *= d;
                no /= 10;
            }
            int dif = Math.abs(sum - pro);
            System.out.println("The difference is " + dif);
        }
    }
}