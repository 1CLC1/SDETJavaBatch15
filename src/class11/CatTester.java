package class11;

public class CatTester {
    public static void main(String[] args) {
        // Creating an object from the Cat class
        Cat cat1= new Cat();
        cat1.name="Candy";
        cat1.breed="Domestic";
        cat1.age=1;
        cat1.color="White";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2= new Cat();
        cat2.name="Spot";
        cat2.breed="Domestic";
        cat2.color="Black & White";

        System.out.println(cat2.breed);
        cat2.speak();

    }
}
