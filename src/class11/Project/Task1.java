package class11.Project;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

       /* 1)Using Scanner create an array of integer values.
       After the array is created,
       calculate the sum of all stored elements in that array.*/

        Scanner scan=new Scanner(System.in);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter any 5 numbers");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        int number3= scanner.nextInt();
        int number4= scanner.nextInt();
        int number5= scanner.nextInt();

        int [] arr = {number1, number2, number3, number4, number5,};

        int sum=0;

        for (int j : arr) {
            sum = sum + j;

        }
        System.out.println("The sum of the numbers you chose is "+sum);
    }
}
