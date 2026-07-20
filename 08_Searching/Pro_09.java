/*Given a sorted array arr[]. Find the element that appears only once in the array. All other elements appear exactly twice. 

Examples:

Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
Output: 4
Explanation: 4 is the only element that appears exactly once.
Input: arr[] = [5]
Output: 5
Input: arr[] = [1, 2, 2, 3, 3]
Output: 1
Constraints:
1 ≤ arr.size() ≤ 2 * 106
1 ≤ arr[i] ≤ 106

 */
public class Pro_09{
    public static void main(String[] args) {
    }
    int single(int[] arr) {
        int n = arr.length;
        int low = 0,high = n-1,mid;
        int idx;
        if(n == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] == arr[mid-1] ){
                idx = mid;
            }
            else if(arr[mid] == arr[mid+1]){
                idx = mid+1;
            }
            else return arr[mid];
            if(idx % 2 == 1) low = mid+1;
            else high = mid-1;
        }
        return 0;
    }
}