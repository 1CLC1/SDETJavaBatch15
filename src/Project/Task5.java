package Project;

public class Task5 {
    public static void main(String[] args) {

        /*5)Create a 2D array of integers. Develop a program which
        will calculate the sum of even and odd numbers for that array.*/

        int[][] arr={ {12,15,17},
                      {18,25,55,75},
                      {22,38,47,80},
        };
        int sumEven=0;
        int sumOdd=0;


        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    sumEven = sumEven + anInt;
                } else {
                    sumOdd = sumOdd + anInt;
                }
            }
        }
        System.out.println("Sum of all even numbers is "+sumEven);
        System.out.println("Sum of all odd numbers is "+sumOdd);

    }
}
