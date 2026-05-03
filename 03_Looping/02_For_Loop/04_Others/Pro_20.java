public class Pro_20 {
    public static void main(String[] args) {
        int s = 0;
        int f = 0;
        boolean b = false;
        for(int n = 1;n <= 1000;n++){
            for(int m = 1;m <= n;m++){
                if(n % m == 0){
                    s = s+m;
                    f++;
                }
            }
            if((s-n) == n && f == 2){
                System.out.println(n);
                b = true;
            }
            s = 0;
            f = 0;
        }
        if(b == false){
            System.out.println("There are no numbers between 1 and 1000 that are both perfect and prime");
        }
    }
}