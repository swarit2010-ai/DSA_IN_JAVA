public class Notes{ 
    public static void main(String[] args) {
        // Merge sort is a technique where:
        /*
        1. Make two arrays of size n/2 each and copy paste elements to them
        2. Then merge the two when size is 1
        */
        int [] arr = {5,4,3,2,1};
        mergesort(arr);
        for(int ele:arr) System.out.print(ele + " ");
    }
    private static void mergesort(int[] arr) {
        // Step 1 -> Create two empty arrays of n/2 and n-n/2
        int n = arr.length;
        if(n == 1) return;
        int[] a = new int[n/2]; // make arr n/2
        int[] b = new int[n-n/2]; // make arr n-n/2;
        int idx = 0;
        // Step 2 -> Copy paste array into a and b
        for(int i = 0;i < a.length;i++) a[i] = arr[idx++];
        for(int i = 0;i < b.length;i++) b[i] = arr[idx++];
        // Step -> Magic
        mergesort(a);
        mergesort(b);
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