package OOPS;

class Students{
    String name;
    private int rno = 564;
    double cgpa;
    private void print(){ // cannot call directly
        System.out.println(name+" "+rno+" "+cgpa);
    }
    public void p(){ // call using another public method
        print();
    }
    int getRno(){ // getter to access specific values
        return rno;
    }
    void setRno(int x){
        rno = x;
    }
}
public class PrivateKeyboard {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.cgpa = 8.9;
        s1.name = "Hemant";
//        s1.rno = 76; // cannot edit
//        System.out.println(s1.rno); // cannot print
//        System.out.println(s1.name);
//        s1.p();
        s1.setRno(45);
        System.out.println(s1.getRno());
    }
}
