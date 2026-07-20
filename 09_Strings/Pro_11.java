/* Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

Examples:

Input: s = "testsample"
Output: 'e'
Explanation: 'e' is the character which is having the highest frequency.
Input: s = "output"
Output: 't'
Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
Constraints:
1 ≤ |s| ≤ 100*/
public class Pro_11{
    public static void main(String[] args) {
    }
    public char getMaxOccuringChar(String s) {
        // my method nlogn
        // code here)
        // char[] arr = s.toCharArray();
        // Arrays.sort(arr);
        // if(arr.length == 1) return s.charAt(0);
        // int c = 0;
        // int max_c = 0;
        // char max_char = 'a';
        // for(int i = 1;i < arr.length;i++){
        //     if(arr[i] == arr[i-1]) c++;
        //     else{
        //         c++;
        //         if(c > max_c) {
        //             max_c = c;
        //             max_char = arr[i-1];
        //         }
        //         c = 0;
        //     }
            
        // }
        // if(arr[arr.length-1] == arr[arr.length-2]){
        //     c++;
        //     if(c > max_c){
        //         max_char = arr[arr.length-1];
        //     }
        // }
        // sliding window method; nlogn
        // char[] arr = s.toCharArray();
        // Arrays.sort(arr);
        // if(arr.length == 1) return s.charAt(0);
        // int c = 0;
        // int max_c = 0;
        // char max_char = 'a';
        // int i = 0;
        // int j = 0;
        // while(j < arr.length){
        //     if(arr[i] == arr[j]) j++;
        //     else{
        //         c = j-i;
        //         if(c > max_c){
        //             max_c = c;
        //             max_char = arr[i];
        //         }
        //         i = j;
        //     } 
        // }
        // c = j-i;
        // if(c > max_c) max_char = arr[i];
        // freq array method n
        int[] freq = new int[26];
        for(int i = 0;i < s.length();i++){
            freq[(int)s.charAt(i)-97]++;
        }
        int high = 0;
        int h = 0;
        int j = 0;
        for(j = 0;j < freq.length;j++){
            if(freq[j] > high) {
                h = j;
                high = freq[j];
            }
        }
        char ch = (char)(h+97);
        return ch;
    }
}