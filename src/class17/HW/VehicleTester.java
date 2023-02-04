package class17.HW;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle("Dodge","Challenger Hellcat",2021);
        vehicle1.printInfo();
        Vehicle vehicle2=new Vehicle();
        vehicle2.printInfo();
    }
}
