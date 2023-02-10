package class11.Project;

public class Task3 {
    public static void main(String[] args) {

        /*3) Create a 2D array of integer values. Print the sum of all numbers.*/

        int [][] arr={{8,13,33,56},
                      {77,23,107,224},
                      {55,85,111,967}
        };

        int sum=0;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum = sum + anInt;
            }
        }
        System.out.println(sum);
    }
}
