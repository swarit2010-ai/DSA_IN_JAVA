//One method :
// import java.util.Scanner;
// public class Pro_23{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the height");
//         int s = sc.nextInt();
//         for(int i = 1;i <= s;i++){
//             for(int j = 1;j <= s;j++){
//                 if((i+j) > s)
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }

//Main method :
import java.util.Scanner;
public class Pro_23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int s = sc.nextInt();
        for(int i = 1;i <= s;i++){
            for(int a = i;a <= (s-1);a++){
                System.out.print("  ");
            }
            for(int b = 1;b <= i;b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}