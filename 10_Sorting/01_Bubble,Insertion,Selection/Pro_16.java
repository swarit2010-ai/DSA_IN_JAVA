/*Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Follow up: Could you come up with a one-pass algorithm using only constant extra space?

Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 2

*/
public class Pro_16{
    public static void main(String[] args) {
    }
    public void sort012(int[] arr) {
        // code here
        int l = 0,m = 0,h = arr.length-1;
        while(m <= h){
            switch (arr[m]) {
                case 0 -> {
                    swap(arr,l,m);
                    l++;
                    m++;
                }
                case 1 -> m++;
                default -> {
                    swap(arr,m,h);
                    h--;
                }
            }
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}