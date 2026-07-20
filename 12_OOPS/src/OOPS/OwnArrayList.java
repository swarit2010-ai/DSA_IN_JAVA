package OOPS;
class Arraylist{ // user defined data structure
    int[] arr;
    int idx = 0;
    int size = 0;
    Arraylist(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length){ // array is full
            capacity_increase();
        }
        arr[idx++] = ele;
        size++;
    }
    void capacity_increase(){
        int[] big_arr = new int[arr.length*2];
        System.arraycopy(arr, 0, big_arr, 0, arr.length);
        arr = big_arr;
    }
    int capacity(){
        return arr.length;
    }
    void set(int idx,int val){
        arr[idx] = val;
    }
    void display(){
        for(int i = 0;i < size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist arr = new Arraylist(3);
        System.out.println(arr.capacity());
        System.out.println(arr.size);
        arr.add(10);arr.add(20);arr.add(30);
        System.out.println(arr.size);
        arr.display();
        arr.add(40);arr.add(20);arr.add(30);
        arr.display();
    }
}
