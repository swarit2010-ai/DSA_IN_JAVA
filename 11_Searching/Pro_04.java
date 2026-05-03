/*You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.



Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1



Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array. */
public class Pro_04{
    public static void main(String[] args) {
        
    }
    public int peakIndexInMountainArray(int[] arr) {
        int high = arr.length-2;
        int mid;
        int low = 1;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] < arr[mid+1]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}