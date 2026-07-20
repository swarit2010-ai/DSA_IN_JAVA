//WAP to sort an array using insertion sort
public class Pro_15{
    public static void main(String[] args) {
        int[] arr = {1,5,8,4,2,0,3,4,1,0,6,7,8,5};
        int n = arr.length;
        print(arr);
        for(int i = 1;i < n;i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
        System.out.println();
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