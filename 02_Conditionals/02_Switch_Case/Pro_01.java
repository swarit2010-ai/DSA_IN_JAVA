import java.util.Scanner;
public class Pro_01{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the day number :");
            int dayn = sc.nextInt();
            switch (dayn){
                case 1 -> System.out.println("Today is Monday");
                case 2 -> System.out.println("Today is Tuesday");
                case 3 -> System.out.println("Today is Wednesday");
                case 4 -> System.out.println("Today is Thursday");
                case 5 -> System.out.println("Today is Friday");
                case 6 -> System.out.println("Today is Saturday");
                case 7 -> System.out.println("Today is Sunday.Holiday,make fun");
                default -> System.out.println("Enter a valid day number");
            }
        }
    }
}