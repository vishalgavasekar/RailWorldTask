package Multilevel;

public class Multilevel {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();

        sportsCar.start();      // From Vehicle
        sportsCar.drive();      // From Car
        sportsCar.accelerate(); // From SportsCar
        sportsCar.stop();       // From Vehicle
        sportsCar.park();       // From Car
        sportsCar.drift();      // From SportsCar
    }
}
