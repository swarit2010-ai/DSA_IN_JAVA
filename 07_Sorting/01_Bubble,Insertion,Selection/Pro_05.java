import java.util.Arrays;
/*
Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output: a[] = [2, 2, 3, 4], b[] = [7, 10]
Explanation: After merging the two non-decreasing arrays, we get, [2, 2, 3, 4, 7, 10]
Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output: a[] = [1, 2, 3, 5, 8, 9], b[] = [10, 13, 15, 20]
Explanation: After merging two sorted arrays we get [1, 2, 3, 5, 8, 9, 10, 13, 15, 20].
Input: a[] = [0, 1], b[] = [2, 3]
Output: a[] = [0, 1], b[] = [2, 3]
Explanation: After merging two sorted arrays we get [0, 1, 2, 3].
Constraints:
1 ≤ n, m ≤ 105
0 ≤ a[i], b[i] ≤ 107*/
public class Pro_05{
    public static void main(String[] args) {
    }
    public void mergeArrays(int a[], int b[]) {
        int[] c = new int[a.length+b.length];
        int i = 0;
        for(int ele:a) {c[i] = ele;i++;}
        for(int ele:b) {c[i] = ele;i++;}
        int j = 0;
        Arrays.sort(c);
        for(int iter = 0;iter < a.length;iter++) {a[iter] = c[j];j++;}
        for(int iter = 0;iter < b.length;iter++) {b[iter] = c[j];j++;}
        
    }
}