/*Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false.

Examples:

Input: arr[] = [111, 222, 333, 444, 555]
Output: true
Explanation:
arr[0] = 111, which is a palindrome number.
arr[1] = 222, which is a palindrome number.
arr[2] = 333, which is a palindrome number.
arr[3] = 444, which is a palindrome number.
arr[4] = 555, which is a palindrome number.
As all numbers are palindrome so This will return true.
Input: arr[] = [121, 131, 20]
Output: false
Explanation: 20 is not a palindrome hence the output is false.
Expected Time Complexity: O(nlogn)
Expected Space Complexity: O(1)

Constraints:
1 <=arr.size<= 20
1 <=arr[i]<= 105 */
public class Pro_09{
    public static void main(String[] args) {
    }
    public static boolean isPalinArray(int[] arr) {
        boolean bool = false;
        for(int element:arr){
            int cp = element;
            int r = 0,d;
            while(cp != 0){
                d = cp % 10;
                r = r*10+d;
                cp /= 10;
            }
            if(r == element)
                bool = true;
            else{
                bool = false;
                break;
            }
        }
        return bool;
    }
}