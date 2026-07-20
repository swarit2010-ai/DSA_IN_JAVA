/* Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
 

Constraints:

1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1*/
public class Pro_04{
    public static void main(String[] args) {
    }
    static int count = 0;
    public static void inversion(int[]a,int[]b){
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if((long)a[i] > (long)2*b[j]){
                count+=a.length-i;
                j++;
            }
            else i++;
        }
    }
    public int reversePairs(int[] nums) {
        count = 0;
        count(nums);
        return count;
    }
    static void count(int arr[]) {
        int n = arr.length;
        if(n == 1) return;
        int[] a = new int[n/2]; // make arr n/2
        int[] b = new int[n-n/2]; // make arr n-n/2;
        int idx = 0;
        // Step 2 -> Copy paste array into a and b
        for(int i = 0;i < a.length;i++) a[i] = arr[idx++];
        for(int i = 0;i < b.length;i++) b[i] = arr[idx++];
        // Step -> Magic
        count(a);
        count(b);
        inversion(a,b);
        // Step 4 -> Merge a and b into arr
        merge(a,b,arr);
    }
    public static void merge(int a[], int b[] , int c[]) {
        int i = 0,j = 0,k = 0;
        while(k < c.length){
            if(i >= a.length) c[k++] = b[j++];
            else if(j >= b.length) c[k++] = a[i++];
            else if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
    }
}