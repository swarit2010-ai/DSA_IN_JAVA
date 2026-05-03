//Sort an array using selection sort
public class Pro_11{
    public static void main(String[] args) {
        int[] arr = {0,5,9,5,4,7,2,3,6,8,1,3,789,5};
        for(int i = 0;i < arr.length-1;i++){
            int pos = -1,min = Integer.MAX_VALUE;
            for(int j = i;j < arr.length;j++){
                if(arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            swap(arr, i, pos);
        }
        print(arr);
    }
    public static void swap(int[] arr,int i,int j){
        arr[i] += arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] -= arr[j];
    }
    public static void print(int[] arr){
        for(int ele:arr) System.out.print(ele + " ");
    }
}