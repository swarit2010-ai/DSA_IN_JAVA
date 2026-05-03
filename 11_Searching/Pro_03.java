import java.util.*;
/*Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Examples:

Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6
Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1]
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i], x ≤ 109 */
public class Pro_03{
    public static void main(String[] args) {
        
    }
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int high = arr.length-1;
        int mid;
        int low = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] == x) {
                while(mid > 0 && arr[mid-1] == arr[mid]) mid--;
                ans.add(mid);
                break;
            }
            else if(arr[mid] > x) high = mid-1;
            else low = mid+1;
        }
        if(ans.isEmpty()) ans.add(-1);
        high = arr.length-1;
        low = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] == x) {
                while(mid < arr.length-1 && arr[mid+1] == arr[mid]) mid++;
                ans.add(mid);
                break;
            }
            else if(arr[mid] > x) high = mid-1;
            else low = mid+1;
        }
        if(ans.size() == 1) ans.add(-1);
        return ans;
    }
}