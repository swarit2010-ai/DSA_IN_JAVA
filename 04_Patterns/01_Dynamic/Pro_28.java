//Mathematical method
// import java.util.Scanner;
// public class Pro_28{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the height");
//         int s = sc.nextInt();
//         for(int i = 1;i <= s;i++){
//             for(int a = i;a <= (s-1);a++){
//                 System.out.print("  ");
//             }
//             for(int b = 1;b <= (2*i-1);b++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//Nice method
import java.util.Scanner;
public class Pro_28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int s = sc.nextInt();
        int stars = 1;
        int spaces = s-1;
        for(int i = 1;i <= s;i++){
            for(int a = 1;a <= spaces;a++){
                System.out.print("  ");
            }
            for(int b = 1;b <= stars;b++){
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }
    }
}