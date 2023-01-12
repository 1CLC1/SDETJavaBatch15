package class4;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        /*
        Write a program to ask user to enter numbers of worked years and annual salary.
        If user worked for more or equals to 5 years than user is eligible for the bonus,
        otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
        otherwise bonus=3000.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of years worked");
        int workedYears = scanner.nextInt();

        System.out.println("Please enter your annual salary");
        int salary = scanner.nextInt();

        if (workedYears>=5){
            System.out.println("Congratulations! You are eligible for a bonus!");
        }
        else {
            System.out.println("You are not eligible for a bonus");
        }
        if(workedYears>=5){
            if(salary>50000){
                System.out.println("Your bonus is $5000");

            }
            else {
                System.out.println("Your bonus is $3000");
            }
        }

    }

}
