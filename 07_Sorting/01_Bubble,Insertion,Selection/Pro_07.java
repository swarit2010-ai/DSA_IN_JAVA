/*Given an array of integers arr[]. You have to find the Inversion Count of the array. 
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104*/
public class Pro_07{
    public static void main(String[] args) {
    }
    static int inversionCount(int arr[]) {
        int c = 0;
        for(int i = 0;i < arr.length-1;i++){
            for(int j = i+1;j < arr.length;j++){
                if(arr[i] > arr[j]) c++;
            }
        }
        return c;
    }
}