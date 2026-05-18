package OOPS;
class Fract{
    int num;
    int den;
    Fract(int num,int den){
        this.num = num;
        this.den = den;
        simplify();
    }
    void simplify(){
        int gcd = hcf(num,den);
        num = num/gcd;
        den = den/gcd;
    }
    void print() {
        System.out.println(num+"/"+den);
    }
    void add(Fract f) {
        num = num * f.den + den * f.num;
        den *= f.den;
        simplify();
    }
    void multiply(Fract f){
        num *= f.num;
        den *= f.den;
        simplify();
    }
    public void divide(Fract f) {
        num *= f.den;
        den *= f.num;
        simplify();
    }
    int hcf(int a,int b){
        if(a == 0) return b;
        return hcf(b%a,a);
    }
}
public class Fraction {
    public static void main(String[] args) {
        Fract f1 = new Fract(3,7);
        f1.print();
        Fract f2 = new Fract(7,3);
        f2.print();
//        f1.add(f2);
//        f1.multiply(f2);
//        f1.divide(f2);
    }
}
