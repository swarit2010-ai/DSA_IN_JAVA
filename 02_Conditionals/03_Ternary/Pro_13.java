import java.util.Scanner;
public class Pro_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter CP and SP:");
            double cp = sc.nextDouble(), sp = sc.nextDouble();
            if (sp > cp) {
                System.out.println("Profit %: " + ((sp - cp) / cp * 100));
            } else if (cp > sp) {
                System.out.println("Loss %: " + ((cp - sp) / cp * 100));
            } else {
                System.out.println("No Profit No Loss");
            }
        }
    }
}