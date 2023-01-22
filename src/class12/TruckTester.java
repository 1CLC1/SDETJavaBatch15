package class12;

public class TruckTester {
    public static void main(String[] args) {
        Truck Chevy=new Truck();
        Chevy.make="Chevrolet";
        Chevy.model="K2500";
        Chevy.color="Green";
        Chevy.fuel="Diesel";
        Chevy.year=1997;
        Chevy.moveForward();
        Chevy.applyBrakes();
    }
}
