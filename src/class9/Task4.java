package class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Write a program to ask a user to enter item they want to buy and the price of that item. User will
        be entering 5 items multiple items every time user enters price accumulate the price and tell the user how much total that they should pay.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"
         */
        /*
        1) Ask user for item price and item name
        2) Accumulate the price
        3) Tell the user how much total that they should pay
        4) If user give more money program should return a change
        5)  Whenever a user done with payments program should say "Thank you for shopping!"
         */
        Scanner scanner = new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please enter the item and its price");
            String itemName=scanner.next();
            double itemPrice=scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("The total amount that you have to pay is "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>totalPrice){
            double change=amountPaid-totalPrice; // calculating  the change
            System.out.println("Here is your change "+change);
        }else if(amountPaid<totalPrice) {
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thank you for shopping!");


    }
}
