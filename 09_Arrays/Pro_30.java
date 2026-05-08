/* Given an array arr, rotate the array by one position in clockwise direction.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
Output: [3, 9, 8, 7, 6, 4, 2, 1]
Explanation: After rotating clock-wise 3 comes in first position.
Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105*/
public class Pro_30{
    public static void main(String[] args) {
    }
    public void rotate(int[] arr) {
        // code here
        for(int k = 0;k < arr.length-1;k++){
            int i = k;
            int j = arr.length-1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}