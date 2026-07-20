/*You are given the string S . Compress the string when lower and upper cases are the same. In compressed string characters should be in lowercase.

Example 1:

Input: S = "aaABBb"
Output: "3a3b"
Explanation: As 'a' appears 3 times
consecutively and 'b' also 3 times,
and 'b' and 'B' considered as same. 
Example 2:

Input: S = "aaacca"
Output: "3a2c1a"
Explanation: As 'a' appears 3 times
consecutively and 'c' also 2 times,
and then 'a' 1 time.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function transform() which takes the string S as inputs and returns the compressed string.


Constraints:
1 ≤ |S| ≤ 2 * 105

S contains only lowercase and uppercase characters.

 */
public class Pro_14{
    public static void main(String[] args) {
    }
    String transform(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int k = 0;k < arr.length;k++) {
            char ch = arr[k];
            char ch2 = Character.toLowerCase(ch);
            arr[k] = ch2;
        }
        // Arrays.sort(arr);
        int c;
        int i = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[i] != arr[j]) {
                ans.append(j-i);
                ans.append(arr[i]);
                
                i = j;
            }
            else j++;
        }
        ans.append(j-i);
        ans.append(arr[i]);
        return ans.toString();
    }
}