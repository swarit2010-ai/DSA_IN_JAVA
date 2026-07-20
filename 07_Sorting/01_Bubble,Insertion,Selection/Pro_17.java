/*Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

Examples:

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: [1, 2, 3, 4, 5, 6, 7]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: [1, 2, 3, 4, 5]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: [1, 2]
Explanation: Distinct elements including both the arrays are: 1 2.
Constraints:
1  ≤  a.size(), b.size()  ≤  105
-109 ≤ a[i], b[i] ≤109 */
import java.util.ArrayList;
public class Pro_17{
    public static void main(String[] args) {
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                // Only add if it's the first element or not a duplicate of the last added
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } else if (b[j] < a[i]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            } else { // a[i] == b[j]
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }
        
        // Process remaining elements of array a
        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }
        
        // Process remaining elements of array b
        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }
        
        return ans;
    }
}