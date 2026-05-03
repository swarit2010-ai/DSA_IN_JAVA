
import java.util.Collections;
import java.util.Vector;

/*Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

Examples:

Input: arr[] = [5, 6, 7, 8]
Output: [5, 6, 7, 9]
Explanation: 5678 + 1 = 5679
Input: arr[] = [9, 9, 9]
Output: [1, 0, 0, 0]
Explanation: 999 + 1 = 1000
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 9
There are no leading zeros in the input number.  */
public class Pro_18{
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> vect = new Vector<>();
        int carry = 1;
        int n = arr.length;
        for(int i = n-1;i >= 0;i--){
            if(arr[i]+carry <= 9){
                vect.add(arr[i]+carry);
                carry = 0;
            }
            else{
                vect.add(0);
                carry = 1;
            }
        }
        if(carry == 1) vect.add(1);
        Collections.reverse(vect);
        return vect;
    }
}