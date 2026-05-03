/*Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.

Examples:

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: We get the sorted array after using merge sort
Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: We get the sorted array after using merge sort 
Constraints:
1 ≤ arr.size() ≤ 10 */
public class Pro_01{
    public static void main(String[] args) {
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        int n = arr.length;
        if(n == 1) return;
        int[] a = new int[n/2]; // make arr n/2
        int[] b = new int[n-n/2]; // make arr n-n/2;
        int idx = 0;
        // Step 2 -> Copy paste array into a and b
        for(int i = 0;i < a.length;i++) a[i] = arr[idx++];
        for(int i = 0;i < b.length;i++) b[i] = arr[idx++];
        // Step -> Magic
        mergeSort(a,l,r);
        mergeSort(b,l,r);
        // Step 4 -> Merge a and b into arr
        merge(a,b,arr);
    }
    public static void merge(int a[], int b[] , int c[]) {
        int i = 0,j = 0,k = 0;
        while(k < c.length){
            if(i >= a.length) c[k++] = b[j++];
            else if(j >= b.length) c[k++] = a[i++];
            else if(a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
    }
}
