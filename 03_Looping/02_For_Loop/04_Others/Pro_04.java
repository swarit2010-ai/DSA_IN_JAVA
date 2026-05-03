public class Pro_04 {
    public static void main(String[] args) {
        int s = 0;
        for(int n = 1;n <= 10;n++){
            if(n % 2 == 0){
                s = s+n;
            }
        }
        System.out.println("The sum of first 10 even natural numbers is " + s);
    }
}