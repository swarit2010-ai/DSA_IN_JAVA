/*Given an integer array arr[] and an integer k, your task is to find and return the kth smallest element in the given array.

Note: The kth smallest element is determined based on the sorted order of the array.

Examples :

Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
Output: 5
Explanation: 4th smallest element in the given array is 5.
Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: 3rd smallest element in the given array is 7.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
1 ≤ k ≤  arr.size()  */
public class Pro_14{
    public static void main(String[] args) {
        
    }
    public int kthSmallest(int[] arr, int k) {
        // Code here
        for(int i = 0;i < k;i++){
            int pos = -1,min = Integer.MAX_VALUE;
            for(int j = i;j < arr.length;j++){
                if(arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        return (k-1);
    }
}