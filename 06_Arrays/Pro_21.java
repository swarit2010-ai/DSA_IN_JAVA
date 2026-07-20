// WAP to merge two sorted arrays in reverse order but the answer should be come as before
import java.util.Arrays;
import java.util.Scanner;
// Merge two sorted arrays
// a = {2,5,6,9} l = 4
// b = {1,3,4,5,10,11} l = 6
// After merging = c = {1,2,3,4,5,5,6,9,10,11} l = 10 
public class Pro_21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of both arrays");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int[] arr_a = new int[l1];
        int[] arr_b = new int[l2];
        int[] arr_c = new int[l1+l2];
        System.out.println("Enter first array");
        for(int i = 0;i < l1;i++)
            arr_a[i] = sc.nextInt();
        System.out.println("Enter second array");
        for(int i = 0;i < l2;i++)
            arr_b[i] = sc.nextInt();
        Arrays.sort(arr_a);
        Arrays.sort(arr_b);
        System.out.println("The merged sorted array is :");
        int i = arr_a.length-1,j = arr_b.length-1,k = arr_c.length-1;
        while(k != -1){
            if(i == -1) arr_c[k] = arr_b[j--];
            else if(j == -1) arr_c[k] = arr_a[i--];
            else if(arr_a[i] > arr_b[j]) arr_c[k] = arr_a[i--];
            else arr_c[k] = arr_b[j--];
            k--;
        }
        for(int ele:arr_c)System.out.println(ele);
    }
}