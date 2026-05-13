package OOPS;
class Cricketer{
    final String country = "India"; // they cannot be changed
    int runs;/*
    These variables belong to the constructor
    */
    String name;
    double avg;
    static String type = "Batsman"; // they are sharable variables.It belongs to the class
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        c1.runs = 99; c1.name = "Rohit Sharma"; c1.avg = 85.6;
//        c1.country = "England"; // thows error because final variable cannot be changed
        Cricketer c2 = new Cricketer();
        c1.type = "Baller"; // changing c1 to baller
        System.out.println(c2.type); // c2 is also changed
    }
}
