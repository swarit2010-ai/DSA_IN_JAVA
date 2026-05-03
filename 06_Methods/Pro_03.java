/*  ncr = Combinaion -> n!/r! * (n-r)!
    npr = Permutation -> n!/(n-r)!
WAP to take n and r as inputs and calculate combinations and permutations
*/
import java.util.Scanner;
public class Pro_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r :");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);
        System.out.println("The ncr is " + ncr);
        System.out.println("The npr is " + npr);
    }
    public static int fact(int x){
        int f = 1;
        for(int i = 1;i <= x;i++){
            f *= i;
        }
        return f;
    }
}