/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
 

Follow up:

How can we prove that at least one duplicate number must exist in nums?
Can you solve the problem in linear runtime complexity? */
public class Pro_04{
    public static void main(String[] args) {
    }
    public int findDuplicate(int[] nums) {
        // boolean flag[] = new boolean[nums.length];
        // for(int i = 0;i < nums.length;i++){
        //     if(flag[nums[i]]) return nums[i];
        //     else flag[nums[i]] = true;
        // }
        // return -1;
        int i = 0;
        while(i < nums.length){
            int idx = nums[i]-1;
            if(i == idx) i++;
            else{
                if(nums[i] == nums[idx]) return nums[i];
                else{
                    int temp = nums[idx];
                    nums[idx] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return -1;
    }
}