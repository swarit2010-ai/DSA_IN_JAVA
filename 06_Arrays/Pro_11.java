// WAP to input an array and multiply odd indexed elements by 2 and
//  add 10 to even indexed numbers
import java.util.Scanner;
public class Pro_11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0;i < l;i++){
            System.out.println("Enter the element :");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < l;i++){
            if(i % 2 == 0)
                arr[i] += 10;
            else
                arr[i] *= 2;
        }
        System.out.println("The modified array is :");
        for(int element:arr)
            System.out.println(element);
    }
}