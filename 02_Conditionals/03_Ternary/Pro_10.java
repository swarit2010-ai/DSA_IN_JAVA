import java.util.Scanner;
public class Pro_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers:");
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int smallest = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
            System.out.println("Smallest is " + smallest);
        }
    }
}