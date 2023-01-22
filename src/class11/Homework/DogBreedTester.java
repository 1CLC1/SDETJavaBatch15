package class11.Homework;

public class DogBreedTester {
    public static void main(String[] args) {

        DogBreed dog1= new DogBreed();
        dog1.name="Husk";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.weight=85;
        dog1.color="Black,Gray,White";
        dog1.bark();

        DogBreed dog2= new DogBreed();
        dog2.name="Gus";
        dog2.breed="Bulldog";
        dog2.age=7;
        dog2.weight=75;
        dog2.color="Tan";
        dog2.sleep();

        DogBreed dog3= new DogBreed();
        dog2.name="Lucky";
        dog2.breed="Labrador";
        dog2.age=8;
        dog2.weight=65;
        dog2.color="Brown";
        dog2.eat();


    }
}
