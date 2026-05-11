package OOPS;

public class UserDefinedDataTypes {
    public static class Student{
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name + " " + cgpa + " " + rno);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Swarit Sharma";
        s1.rno = 48;
        s1.cgpa = 9.9;
        Student s2 = new Student();
        s2.name = "Raghav Garg";
        s2.rno = 33;
        s2.cgpa = 5.7;
        Student s3 = new Student();
        s3.name = "Khushi";
        s3.rno = 27;
        s3.cgpa = 8.9;
//        System.out.println(s1.name + " " + s1.cgpa + " " + s1.rno);
//        System.out.println(s2.name + " " + s2.cgpa + " " + s3.rno);
//        System.out.println(s3.name + " " + s3.cgpa + " " + s3.rno);
        s1.print();
        s2.print();
        s3.print();
    }
}