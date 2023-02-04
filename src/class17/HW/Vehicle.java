package class17.HW;

public class Vehicle {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
    */

    String brand;
    String model;
    int year;

    Vehicle(String vBrand,String vModel,int vYear){
        brand=vBrand;
        model=vModel;
        year=vYear;

    }
    Vehicle(){

    }
    void printInfo(){
        System.out.println("Vehicle brand: "+brand+" Model "+model+" Year"+year);
    }
}
