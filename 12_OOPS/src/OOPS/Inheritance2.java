package OOPS;
class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PowerVehicle extends Vehicle{ // Single level Inheritance
    int engine;
}
class Aircrafts extends PowerVehicle{ // Multi level inheritance
    int rotors;
}
public class Inheritance2 {
    public static void main(String[] args) {
        Vehicle cycle = new Vehicle();
        PowerVehicle car = new PowerVehicle();
        Aircrafts plane = new Aircrafts();
    }
}
