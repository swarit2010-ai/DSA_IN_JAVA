public class Pro_02{
    public static void main(String[] args) {
    }
    int missingNum(int arr[]) {
        int n = arr.length+1;
        int i = 0;
        while(i < n-1){
            if(arr[i] == i+1) i++;
            else if(arr[i] > arr.length) i++;
            else{
                int idx = arr[i]-1;
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        for(int j = 0;j < arr.length;j++){
            if(arr[j] != j+1) return j+1;
        }
        return arr.length+1;
    }
}