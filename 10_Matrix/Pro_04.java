// WAP to find the minimum element out of all the maximum elements from each row
public class Pro_04{
    public static void main(String[] args) {
        int[][] arr = {{1,2,5},{1,5,6}};
        int[] max = new int[arr.length];
        int i = 0;
        for(int[] arr_ele:arr){
            int max_value = Integer.MIN_VALUE;
            for(int ele:arr_ele){
                if(ele > max_value) max_value = ele;
            }
            max[i] = max_value;
            i++;
        }
        int min = Integer.MAX_VALUE;
        for(int ele_2:max){
            if(ele_2 < min) min = ele_2;
        }
        System.out.println(min);
    }
}