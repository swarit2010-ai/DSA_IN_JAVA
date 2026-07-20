
import java.util.ArrayList;

/*Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

Note: You can return the elements in any order but the driver code will print them in sorted order.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [3, 1, 2] 
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
Constraints:
1 ≤ n ≤ 106
1 ≤ arr[i] ≤ n */
public class Pro_05{
    public static void main(String[] args) {
    }
    public ArrayList<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int idx = nums[i]-1;
            if(nums[i] == i+1 || nums[i] == nums[idx]) i++;
            else{
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
            }
        }
        for(i = 0;i < nums.length;i++){
            if(nums[i] != i+1) ans.add(nums[i]);
        }
        return ans;
    }
}