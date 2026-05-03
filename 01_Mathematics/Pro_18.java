import java.util.Scanner;
public class Pro_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first week's pages :");
        int page_1 = sc.nextInt();
        System.out.println("Enter second week's pages :");
        int page_2 = sc.nextInt();
        System.out.println("Enter third week's pages :");
        int page_3 = sc.nextInt();
        System.out.println("Enter fourth week's pages :");
        int page_4 = sc.nextInt();
        int total_pages = page_1 + page_2 + page_3 + page_4;
        System.out.println("Total amount to be paid is " + total_pages*60 + " rupees");
    }
}