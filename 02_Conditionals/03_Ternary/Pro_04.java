import java.util.Scanner;
public class Pro_04 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter percentage marks :");
            int marks = sc.nextInt();
            System.out.println((marks > 90) ? 'A' : (marks > 80) ? 'B' : (marks > 70) ? 'C' : 'D');
        }
    }
}