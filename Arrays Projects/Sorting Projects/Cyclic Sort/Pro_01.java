// WAP to solve an array using cyclic sort
public class Pro_01{
    public static void main(String[] args) {
        int[] arr = {4,6,5,2,1,3,0};
        int i = 0;
        while(i < arr.length){
            if(arr[i] == i) i++;
            else {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }
        for(int ele:arr) System.out.println(ele);
    }
}