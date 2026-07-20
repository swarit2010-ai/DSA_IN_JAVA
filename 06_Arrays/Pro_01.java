// WAP to print only negative integers in an array of inputed length
import java.util.Scanner;
public class Pro_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element = 0;
        System.out.println("Enter array size :");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0;i < l;i++){
            System.out.println("Enter the element :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing negative values :");
        for(int i = 0;i < l;i++){
            element = arr[i];
            if(element < 0)
                System.out.println(element);
        }
    }
}