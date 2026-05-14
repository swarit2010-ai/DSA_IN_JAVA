package OOPS;
class Complex{
    int x;
    int y;
    Complex(int x,int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y >= 0) System.out.println(x + " + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }

    public void add(Complex z) {
        x += z.x;
        y += z.y;
    }

    public void multiply(Complex z) {
        x = (z.x*x) - (y*z.y);
        y = (x*z.y) + (y*z.x);
    }

    public void divide(Complex z) {
        
    }
}
public class ComplexNumber {
    public static void main(String[] args) {
        Complex z1 = new Complex(2,-5);
        Complex z2 = new Complex(3,4);
        z1.print(); z2.print();
        z1.add(z2);
        z1.print(); z2.print();
        z2.multiply(z1);
        z1.print(); z2.print();
        z2.divide(z1);
        z1.print(); z2.print();
    }
}
