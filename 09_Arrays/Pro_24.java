/*You are given an array arr[] of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.
Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.
Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.
Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105 */
public class Pro_24{
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0) {
                if(i != j){
                    swap(arr, i, j);
                }
                j++;
            }
        }
        // ArrayList method
        // ArrayList<Integer> ans = new ArrayList<>();
        // int c = 0;
        // for(int i = 0;i < arr.length;i++){
        //     if(arr[i] == 0) c++;
        //     else ans.add(arr[i]);
        // }
        // for(int j = 1;j <= c;j++){
        //     ans.add(0);
        // }
        // for(int k = 0;k < arr.length;k++){
        //     arr[k] = ans.get(k);
        // }
    }
    public static void swap(int[] arr,int i,int j){
        arr[i] += arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] -= arr[j];
    }
}