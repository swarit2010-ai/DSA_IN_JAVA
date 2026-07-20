// WAP to binary search in a descending sorted array
public class Pro_05{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int low = 0;
        int high = arr.length-1;
        int mid;
        int target = 3;
        int idx = -1;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid] == target) {
                idx = mid;
                break;
            }
            else if(arr[mid] > target) low = mid+1;
            else high = mid-1;
        }
        System.out.println(idx);
    }
}