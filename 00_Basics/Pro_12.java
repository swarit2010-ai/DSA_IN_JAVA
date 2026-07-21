import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        System.out.println("Give an input :");
        try (Scanner scanner = new Scanner(System.in)) {
            boolean input = scanner.hasNextInt();
            System.out.println(input);
        }
    }
}