public class Notes{
    public static void main(String[] args) {
        // creating an array
        // int[] arr = {6,19,7,69,9,171,5};
        // indexing {The process of naming elements in an array}
        // printing elements using index
        // System.out.println(arr[5]);
        // Updating an array - mutabilation[changing]
        // arr[3] = 89;
        // initializing an array(second method) Empty array
        // int[] nums = new int[4];
        // nums[0] = 5;
        // nums[1] = 6;
        // nums[2] = 7;
        // nums[3] = 8;
        // accesing an array
        // int element = arr[3];
        // size of an array
        // int l = arr.length;
        // Printing an array
        // int[] arr1 = {5,4,5,4,5,4,6,4,6,4};
        // for(int i = 0;i < arr1.length;i++){
        //     System.out.println(arr1[i]);
        // }
        // inputing an array
        // Scanner sc = new Scanner(System.in);
        // int[] swarit = new int[5];
        // for(int i = 0;i < swarit.length;i++){
        //     System.out.println("Enter the element :");
        //     swarit[i] = sc.nextInt();
        // }
        // // printing an array
        // for(int i = 0;i < swarit.length;i++){
        //     System.out.println(swarit[i]);
        // }
        // array of other data types
        // double[] arr2 = new double[8];
        // char[] arr3 = new char[8];
        // String[] arr4 = new String[8];
        // String s = "Hello World";
        // arr4[0] = s;
        // passing array to methods when arrays are passed to methods
        // their shallow copies are made.As the name suggests a reference 
        // of the original has been made
        // int x[] = {1,2,3,4,5,6};
        // System.out.println(x[2]);
        // change(x);
        // System.out.println(x[2]);
        // shallow copy 
        // int[] arr5 = {10,20,30,40,50};
        // // int[] arr6 = arr5;// arr6 is a shallow copy of arr5
        // // arr5[2] = 60;
        // // System.out.println(arr6[2]);
        // // deep copy
        // // int[] arr7 = {1,2,3,4,5,6};
        // // int[] deep = Arrays.copyOf(arr7, arr7.length); // creating a deep copy
        // // deep[0] = 100;
        // // System.out.println(arr7[0]);
        // // sorting an array(builtin function)
        // // int[] sort = {2,3,7,5,-9,-5};
        // // print(sort);
        // // Arrays.sort(sort);
        // // System.out.println();
        // // print(sort);
        // // Arraylist (Dynamic arrays)
        // // Collection framework
        // ArrayList<Integer> arr = new ArrayList<>();//size in arraylist = length in arr
        // //adding elements
        // arr.add(25);
        // arr.add(21);
        // arr.add(18);
        // arr.add(5);
        // arr.add(10);
        // //access
        // // System.out.println(arr.get(3));
        // //changing
        // arr.set(3, 50);
        // // System.out.println(arr);
        // //length
        // int n = arr.size();
        // // for(int i = 0;i < n;i++){
        // //     System.out.println(arr.get(i));
        // // }
        // //adding elements in between
        // arr.add(1,100);
        // // System.out.println(arr);
        // //removing elements
        // arr.remove(1);
        // // System.out.println(arr);
        // // Collections.reverse(arr);
        // // System.out.println(arr);
        // int i = 0,j = arr.size()-1;
        // int p1,p2;
        // while(i < j){
        //     p1 = arr.get(i);
        //     p2 = arr.get(j);
        //     p1 += p2;
        //     p2 = p1-p2;
        //     p1 -= p2;
        //     arr.set(i, p1);
        //     arr.set(j, p2);
        //     i++;
        //     j--;
        // }
        // System.out.println(arr);
    }
    public static void change(int[] y){
        y[2] = 99;
    }
    public static void print(int[] arr){
        for(int element:arr){
            System.out.print(element + " ");
        }
    }
}