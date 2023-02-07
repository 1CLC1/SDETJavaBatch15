package class19;

public class Donkey {
    String name; //Donkey's name is null
    int age; //age is 0
    double weight; //weight is 0.0

    /*
    Donkey(){
        System.out.println("This is not an argument constructor");
    }
    */

    Donkey(String name, int age){
        this.name=name;
        this.age=age;
    }

    void print(){
        System.out.println("Donkey's name is "+name+" age is "+age+" and weight is "+weight);
    }
}
