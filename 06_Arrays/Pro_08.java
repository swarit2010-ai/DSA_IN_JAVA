/*Given an array arr[]. Your task is to find the minimum and maximum elements in the array.

Examples:

Input: arr[] = [1, 4, 3, 5, 8, 6]
Output: [1, 8]
Explanation: minimum and maximum elements of array are 1 and 8.
Input: arr[] = [12, 3, 15, 7, 9]
Output: [3, 15]
Explanation: minimum and maximum element of array are 3 and 15.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 109

*/
public class Pro_08{
    public static void main(String[] args) {
    }
    public int[] getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int element:arr){
            if(element > max)
                max = element;
            if(element < min)
                min = element;
        }
        int[] minmax = {min,max};
        return minmax;
    }
}