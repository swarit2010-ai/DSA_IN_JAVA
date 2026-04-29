/*Given an integer array arr[] and an integer k, your task is to find and return the kth smallest element in the given array.

Note: The kth smallest element is determined based on the sorted order of the array.

Examples :

Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
Output: 5
Explanation: 4th smallest element in the given array is 5.
Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: 3rd smallest element in the given array is 7.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
1 ≤ k ≤  arr.size()  */
public class Pro_06{
    public static void main(String[] args) {
    }
    public int kthSmallest(int[] arr, int k) {
        // Code here
        // Arrays.sort(arr);
        // return arr[k-1];
        // for(int i = 0;i < k;i++){
        //     int pos = -1,min = Integer.MAX_VALUE;
        //     for(int j = i;j < arr.length;j++){
        //         if(arr[j] < min) {
        //             min = arr[j];
        //             pos = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[pos];
        //     arr[pos] = temp;
        // }
        // return arr[k-1];
        mergeSort(arr);
        return arr[k-1];
    }
    void mergeSort(int arr[]) {
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
        mergeSort(a);
        mergeSort(b);
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