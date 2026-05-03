import java.util.Scanner;
public class Pro_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter first subject's marks :");
            double m1 = sc.nextDouble();
            double m1p = (m1/100)*100;
            if(m1p >= 33){
                System.out.println("Pass in first subject with " + m1p + "%");
            }
            else{
                System.out.println("Fail in first subject with " + m1p + "%");
            }
            System.out.println("Enter second subject's marks :");
            double m2 = sc.nextDouble();
            double m2p = (m2/100)*100;
            if(m2p >= 33){
                System.out.println("Pass in second subject with " + m2p + "%");
            }
            else{
                System.out.println("Fail in second subject with " + m2p + "%");
            }
            System.out.println("Enter third subject's marks :");
            double m3 = sc.nextDouble();
            double m3p = (m3/100)*100;
            if(m3p >= 33){
                System.out.println("Pass in third subject with " + m3p + "%");
            }
            else{
                System.out.println("Fail in third subject with " + m3p + "%");
            }
            double tm = m1+m2+m3;
            double tmp = (tm/300)*100;
            if(tmp >= 40){
                System.out.println("Pass in aggregate with " + tmp + "%");
            }
            else{
                System.out.println("Fail in aggregate with " + tmp + "%");
            }
        }
    }
}