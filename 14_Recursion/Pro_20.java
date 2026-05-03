/*Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1. 

Note: If multiple occurrences are there, please return the smallest index.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: 3
Explanation: 4 appears at index 3.
Input: arr[] = [11, 22, 33, 44, 55], k = 445
Output: -1
Explanation: 445 is not present.
Input: arr[] = [1, 1, 1, 1, 2], k = 1
Output: 0
Explanation: 1 appears at index 0.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106
1 ≤ k ≤ 106 */
public class Pro_20{
    public static void main(String[] args) {
    }
    public int firstSearch(int[] arr, int k) {
        // Code Here
        return search(arr,k,0,arr.length-1);
    }
    public int search(int[]arr,int k,int i,int j){
        if(i > j) return -1;
        int mid = (i+j)/2;
        if(arr[mid] == k){
            if(mid > 0 && arr[mid-1] == k) return search(arr,k,i,mid-1);
            else return mid;
        }
        else if(arr[mid] > k) return search(arr,k,i,mid-1);
        else return search(arr,k,mid+1,j);
        
    }
}