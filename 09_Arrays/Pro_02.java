// WAP to print the sum of an array of inputed length
import java.util.Scanner;
public class Pro_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element;
        System.out.println("Enter array size :");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0;i < l;i++){
            System.out.println("Enter the element :");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i < l;i++){
            element = arr[i];
            sum += element;
        }
        System.out.println("The sum is " + sum);
    }
}