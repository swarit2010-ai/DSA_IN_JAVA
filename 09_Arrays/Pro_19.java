import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// WAP to add two numbers represented by an array
// {3,5,2,8,7} + {9,2,1} = {3,6,2,0,8}
public class Pro_19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of both arrays");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int[] a = new int[l1];
        int[] b = new int[l2];
        System.out.println("Enter first array");
        for(int i = 0;i < l1;i++)
            a[i] = sc.nextInt();
        System.out.println("Enter second array");
        for(int i = 0;i < l2;i++)
            b[i] = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        int[] large = b,small = a;
        if(b.length < a.length) {small = b;large = a;}
        int n = large.length,n1 = small.length;
        ArrayList<Integer> small_list = new ArrayList<>();
        for(int i = 0;i < n1;i++) small_list.add(small[i]);
        for(int i = 1;i <= n-n1;i++) small_list.add(0,0);
        int carry = 0;
        int p1,p2;
        for(int i = n-1;i >= 0;i--){
            p1 = large[i];
            p2 = small_list.get(i);
            int sum = p1+p2+carry;
            if(sum > 9){
                carry = sum/10;
                ans.add(sum%10);
            }
            else {
                ans.add(sum);
                carry = 0;
            }
        }
        if(carry != 0) ans.add(carry);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}