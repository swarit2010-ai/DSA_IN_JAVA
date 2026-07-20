package OOPS;
public class Constructor {
    public static class Car{
        int seats; // 0
        String name;// null
        double length;// 0.0
        int price;
        // Constructor Overloading:
        Car(){ // default Constructor

        }
        Car(int n,String s,double d){ // Parametarized Constructor
            seats = n;
            name = s;
            length = d;
        }
        Car(String s,int p){ // Constructor with same name but different parameters
            name = s;
            price = p;
        }
        Car(int p,String s){ // Constructor with same name but different order of parameters
            name = s;
            price = p;
        }
        void print() {
            System.out.println(seats + " " + name + " " + length);
        }
        void p(){
            System.out.println(name+" "+price);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia Sonet",3.99);
        c1.print();
        Car c2 = new Car(5,"Honda Amaze",4.45);
        c2.print();
        Car c3 = new Car(4,"Lord Alto",3.75);
        c3.print();
        Car c4 = new Car("Lord Alto",1250000);
        c4.p();
        Car c5 = new Car(56000,"Lord Alto");
        c5.p();
    }
}
class Marks{ // showing the use of constructor in real world
    public static class StudentData{
        String name;
        int rno;
        int size;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
        public void print() {
            for(int i = 0;i < marks.length;i++) System.out.print(marks[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StudentData s1 = new StudentData(4);// showing that array can also be made differentiated using Constructors
        StudentData s2 = new StudentData(2);
        s1.marks[0] = 89;
        s1.marks[1] = 95;
        s1.marks[2] = 56;
        s1.marks[3] = 78;
        s2.marks[0] = 99;
        s2.marks[1] = 69;
        s1.print();//Printing specific arrays
        s2.print();
    }
}
