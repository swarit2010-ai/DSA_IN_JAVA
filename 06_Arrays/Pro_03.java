// WAP to print the product of an array of inputed length
import java.util.Scanner;
public class Pro_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element;
        int pro = 1;
        System.out.println("Enter array size :");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0;i < l;i++){
            System.out.println("Enter the element :");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < l;i++){
            element = arr[i];
            pro *= element;
        }
        System.out.println("The product is " + pro);
    }
}