package class11.Homework;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iPhone= new Phone();
        iPhone.brand="Apple";
        iPhone.model="iPhone X";
        iPhone.ring();

        Phone Pixel= new Phone();
        Pixel.brand="Google";
        Pixel.model="Google Pixel 7";
        Pixel.ring();

        Phone Samsung= new Phone();
        Samsung.brand="Samsung";
        Samsung.model="Samsung Galaxy S21";
        Samsung.ring();

    }
}
