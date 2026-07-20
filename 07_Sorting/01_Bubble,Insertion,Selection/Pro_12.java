//Sort an array using selection sort in reverse order
public class Pro_12{
    public static void main(String[] args) {
        int[] arr = {0,5,9,5,4,7,2,3,6,8,1,3,789,5};
        for(int i = arr.length-1;i > 0;i--){
            int pos = -1,max = Integer.MIN_VALUE;
            for(int j = 0;j <= i;j++){
                if(arr[j] > max) {
                    max = arr[j];
                    pos = j;
                }
            }
            swap(arr, i, pos);
        }
        print(arr);
    }
    public static void swap(int[] arr,int i,int j){
        if(i == j) return;
        arr[i] += arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] -= arr[j];
    }
    public static void print(int[] arr){
        for(int ele:arr) System.out.print(ele + " ");
    }
}