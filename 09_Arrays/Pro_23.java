// Given an array of size n+1 consisting of integers from 1 to n.One of the
// elements is duplicate in an array.Find that duplicate element
//arr = {5,1,3,4,2,4}
// ans = 4;
public class Pro_23{
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,4};
        int dup;
        // brute force
        // for(int i = 0;i < arr.length;i++){
        //     for(int j = i+1;j < arr.length;j++){
        //         if(arr[i] == arr[j]){
        //             dup = arr[i];
        //             break;
        //         }
        //     }
        // }
        // System.out.println(dup);
        
        // Marking in another array(flag array)
        // boolean[] flag = new boolean[arr.length];
        // for(int ele:arr){
        //     if(flag[ele] == true){
        //         dup = ele;
        //         break;
        //     }
        //     else flag[ele] = true;
        // }
        // System.out.println(dup);
        
        // most optimized
        int sum_arr = 0,sum;
        for(int ele:arr) sum_arr += ele;
        sum = arr.length*(arr.length-1)/2;
        dup = sum_arr-sum;
        System.out.println(dup);
    }
}