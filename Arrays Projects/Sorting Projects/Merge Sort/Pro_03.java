/*Given an array of integers arr[]. You have to find the Inversion Count of the array. 
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104

 */
public class Pro_03{
    public static void main(String[] args) {
    }
    static int count = 0;
    static int inversionCount(int arr[]) {
        // int c = 0;
        // for(int i = 0;i < arr.length-1;i++){
        //     for(int j = i+1;j < arr.length;j++){
        //         if(arr[i] > arr[j]) c++;
        //     }
        // }
        // return c;
        count = 0;
        count(arr);
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
        // Step 4 -> Merge a and b into arr
        merge(a,b,arr);
    }
    public static void merge(int a[], int b[] , int c[]) {
        int i = 0,j = 0,k = 0;
        while(k < c.length){
            if(i >= a.length) c[k++] = b[j++];
            else if(j >= b.length) c[k++] = a[i++];
            else if(a[i] <= b[j]) c[k++] = a[i++];
            else{
                count+=a.length-i;
                c[k++] = b[j++];
            } 
        }
    }
}