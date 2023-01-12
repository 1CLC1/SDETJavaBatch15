package class4;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask if user has a credit card or not.
        If you user does not have a credit card then offer them.
        If they do have one ask what is balance on the card?
        If balance of the card is larger than 1000, tell them to pay off immediately,
        otherwise you can tell them that they can spend more.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String cc = scanner. nextLine();

        if(cc.equalsIgnoreCase("No")) {
            System.out.println("Would you be interested in having a credit card? ");
            String offer = scanner.nextLine();
            if(offer.equalsIgnoreCase("Yes"))
                System.out.println("You have now received a credit card.");

            } else if (cc.equalsIgnoreCase("Yes")) {
                System.out.println("What is the balance on your credit card? ");
                int balance = scanner.nextInt();
                if(balance>1000){
                    System.out.println("Balance is too high. You should pay off your balance immediately.");
                }
                else {
                    System.out.println("You can spend more on your credit card.");
            }
        }

    }
}
