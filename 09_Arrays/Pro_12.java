// WAP to linear search for element x in an array
import java.util.Scanner;
public class Pro_12{
    public static void main(String[] args) {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0;i < l;i++){
            System.out.println("Enter the element :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        for(int i = 0;i < l;i++){
            if(arr[i] == x){
                check = true;
                break;
            }
        }
        if(check)
            System.out.println("Exists");
        else
            System.out.println("Does not exist");
    }
}