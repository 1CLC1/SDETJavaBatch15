package class12;

public class Truck {
    String make;
    String model;
    String color;
    String fuel;
    int year;

    void moveForward(){
        System.out.println("Truck is moving forward");
    }
    void applyBrakes() {
        System.out.println("Applying the brakes");
        System.out.println("Truck stopped");
    }
}
