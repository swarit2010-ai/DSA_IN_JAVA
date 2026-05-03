// WAP to linear search an array
public class Pro_18{
    public static void main(String[] args) {
        int x = 21;
        int[] arr = {1,2,3,4,5,6};
        System.out.println(find(arr,x,0));
    }
    public static boolean find(int[] arr,int x,int i) {
        if(i == arr.length) return false;
        if(arr[i] == x) return true;
        return find(arr, x, i+1);
    }
}