public class Pro_24 {
    public static void main(String[] args) {
        int fd,sd,sum;
        for(int n = 1;n <= 50;n++){
            fd = n/10;
            sd = n%10;
            sum = fd +sd;
            System.out.println("THe sum of the digits of " + n + " is " + sum);
        }
    }
}