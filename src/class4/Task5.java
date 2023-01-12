package class4;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into Celsius and print
        “The temperature is the city  is”
         */

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("What is the temperature in Fahrenheit?");
        double temp = scan.nextDouble();
        temp = (temp-32)*5/9;
        System.out.println("The temperature in your city, " + city + " is " +temp+ " Celsius. ");
    }
}
