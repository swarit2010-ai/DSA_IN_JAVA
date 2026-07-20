// Use recursion to print a triangle of stars
public class Pro_10{
    // public static void main(String[] args) {
    //     int n = 6;
    //     print_rows(n,1);
    // }
    // public static void print_rows(int n,int i){
    //     if(i > n) return;
    //     print_cols(n, 1,i);
    //     System.out.println();
    //     print_rows(n, i+1);
    // }
    // public static void print_cols(int n,int j,int i){
    //     if(j > i) return;
    //     System.out.print("* ");
    //     print_cols(n, j+1, i);
    // }
    public static void main(String[] args) {
        int n = 10;
        print(n,1,1);
    }
    public static void print(int n,int i,int j){
        if(i > n);
        else {
            if(j > i) {
                System.out.println();
                print(n, i+1, 1);
            }
            else {
                System.out.print("* ");
                print(n, i, j+1);
            }
        }
    }
}