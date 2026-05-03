/*  Given an array arr[]. The task is to find the largest element and return it.

Examples:

Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
Input: arr[] = [5, 5, 5, 5]
Output: 5
Explanation: The largest element of the given array is 5.
Input: arr[] = [10]
Output: 10
Explanation: There is only one element which is the largest.
Constraints:
1 <= arr.size()<= 106
0 <= arr[i] <= 106 */
import java.util.Scanner;
public class Pro_04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the array elements :");
        for(int i = 0;i < l;i++)
            arr[i] = sc.nextInt();
        System.out.println(largest(arr));
    }
    public static int largest(int[] arr) {
        int element;
        int max = arr[0];
        for(int i = 0;i < arr.length;i++){
            element = arr[i];
            if(element > max)
                max = element;
        }
        return max;
    }
}