import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            System.out.println("Hello " + name + ",have a good day!");
        }
    }
}
