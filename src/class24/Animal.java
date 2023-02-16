package class24;

public abstract class Animal {

   abstract void speak();
   void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("Woof woof....");
    }
    void eat(){
        System.out.println("eating meat....");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Meow meow...");
    }
    void eat(){
        System.out.println("eating tuna....");
    }
}
class Bird extends Animal{
    void speak(){
        System.out.println("Chirp chirp...");
    }
    void eat(){
        System.out.println("eating seeds....");
    }
}