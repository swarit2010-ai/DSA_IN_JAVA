
import java.util.ArrayList;

/* You are given an integer array nums consisting only of 0, 1, and 2.

A pair of indices (i, j) is called valid if nums[i] == 1 and nums[j] == 2.

Return the minimum absolute difference between i and j among all valid pairs. If no valid pair exists, return -1.

The absolute difference between indices i and j is defined as abs(i - j).

 

Example 1:

Input: nums = [1,0,0,2,0,1]

Output: 2

Explanation:

The valid pairs are:

(0, 3) which has absolute difference of abs(0 - 3) = 3.
(5, 3) which has absolute difference of abs(5 - 3) = 2.
Thus, the answer is 2.

Example 2:

Input: nums = [1,0,1,0]

Output: -1

Explanation:

There are no valid pairs in the array, thus the answer is -1.

 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 2©leetcode*/
public class Pro_09{
    public static void main(String[] args) {
    }
    public int minAbsoluteDifference(int[] nums) {
        ArrayList<Integer> dif = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length-1;i++){
            if(nums[i] != 0){
                for(int j = i+1;j < nums.length;j++){
                    if(nums[j] != 0 && nums[j] != nums[i]){
                        dif.add(Math.abs(i-j));
                    }
                }
            }
        }
        for(int i = 0;i < dif.size();i++){
            if(dif.get(i) < min) min = dif.get(i);
        }
        if(dif.isEmpty()) return -1;
        else return min;
    }
}