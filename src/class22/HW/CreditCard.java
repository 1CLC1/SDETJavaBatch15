package class22.HW;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
    */

    double balance;
    double interest;

    void calculateInterest(double balance, double interest){
        System.out.println((balance * interest) /100);
    }
}
class Visa extends CreditCard {

}
class AX extends CreditCard {
    void calculateInterest(double balance, double interest) {
        System.out.println((balance * interest) / 100);
    }

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculateInterest(133100,1.5);
        Visa visa=new Visa();
        visa.calculateInterest(157457,2.7);
        AX ax=new AX();
        ax.calculateInterest(375000,3.2);
    }
}
