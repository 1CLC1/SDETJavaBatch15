package class11.Project;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*2)Using Scanner create an array of countries. When an array is created,
        retrieve all values from it and while retrieving those values print capital for each country.
        (use 2 different loops).*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 countries out of the following 5: USA, El Salvador, Russia, Mexico and United Kingdom");
        String country1=scanner.nextLine();
        String country2=scanner.nextLine();
        String country3=scanner.nextLine();

        String [] country={"USA", "El Salvador", "Russia", "Mexico", "United Kingdom"};
        String [] capital = { "Washington DC", "San Salvador", "Moscow", "Mexico City", "London"};

        for (int i=0; i<country.length; i++) {
            if (country1.equals(country[i])) {
                System.out.println("The capital of " + country[i] + " is " + capital[i]);
            }
            if (country2.equals(country[i])) {
                System.out.println("The capital of " + country[i] + " is " + capital[i]);
            }
            if (country3.equals(country[i])) {
                System.out.println("The capital of " + country[i] + " is " + capital[i]);
            }

        }
    }
}
