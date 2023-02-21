package Project2;

public class Car {
   /*
    Create a Class Car that would have the
    following fields: carPrice and color and method
    calculateSalePrice() which should be returning
    a price of the car.
         Create 2 subclasses: Sedan and Truck. The Truck
    class has a field as weight and has its own
    implementation of calculateSalePrice() method
    in which returned price is calculated as
    following: if weight>2000 then returned price
    car should include 10% discount, otherwise 20%
    discount.
    The Sedan class has field as length and also
    does its own implementation of
    calculateSalePrice(): if length of sedan is >20
    feet then returned car price should include 5%
    discount, otherwise 10% discount
    */

    public String color;
    public double carPrice;

    public Car(String color, double carPrice){
        this.color=color;
        this.carPrice=carPrice;
    }
    public double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{

   public double length;

    public Sedan(String color, double carPrice,double length){
        super(color, carPrice);
        this.length=length;
    }

    @Override
    public double calculateSalePrice() {
        if (length>20){
            return carPrice*0.95;
        }else {
            return  carPrice*0.90;
        }
    }
}
class Truck extends Car{

    public double weight;

    public Truck(String color, double carPrice,double weight){
        super(color, carPrice);
        this.weight=weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight>2000){
            return carPrice*0.90;
        }else {
            return carPrice*0.80;
        }
    }

    public static void main(String[] args) {
        Sedan sedan=new Sedan("Blue",23900,15);
        System.out.println(sedan.calculateSalePrice());
        Truck truck=new Truck("Red",41950,8650);
        System.out.println(truck.calculateSalePrice());
    }
}
