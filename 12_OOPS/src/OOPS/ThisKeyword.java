package OOPS;

public class ThisKeyword {
    static class This{
        String name = "Swarit Sharma";
        void print(String name){
            System.out.println(this.name); // this keyword prints the local name
            System.out.println(name); // default prints the passed name
        }
    }
    public static void main(String[] args) {
        This t = new This();
        t.print("Raghav Garg");
    }
}
