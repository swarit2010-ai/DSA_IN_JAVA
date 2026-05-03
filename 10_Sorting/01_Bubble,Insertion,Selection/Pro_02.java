// WAP to sort an array using bubble sort
public class Pro_02{
    public static void main(String[] args) {
        int[] arr = {1,5,8,4,2,0,3,4,1,0,6,7,8,5};
        int n = arr.length;
        // boolean check = true;
        print(arr);
        for(int j = 1;j <= n-1;j++){
            // for(int k = 0;k < arr.length;k++){
            //     if(arr[k] > arr[k+1]){
            //         check = false;
            //         break;
            //     }
            // }
            // if(check = true) break;
            // int swaps = 0;
            for(int i = 0;i < n-j;i++){
                if(arr[i+1] < arr[i]){swap(arr, i, i+1);}
            }
            // check = true;
            // if(swaps == 0) break;
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