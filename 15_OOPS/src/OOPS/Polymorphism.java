package OOPS;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("GRRRRRR");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static void main(String[] args) {
        Human h = new Human();
        Pikachu p = new Pikachu();
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        h.speak();
        p.speak();
        d.speak();
        c.speak();
        l.speak();
    }
}
