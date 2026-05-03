public class Pro_14 {
    public static void main(String[] args) {
        for(int i = 1,n = 5;i <= 5;i++,n--){
            for(int j = 1,m = 5;j <= 5;j++,m--){
                if(i == 1)
                    System.out.print(j);
                else if(i == 5)
                    System.out.print(m);
                else if(j == 1)
                    System.out.print(i);
                else if(j == 5)
                    System.out.print(n);
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
