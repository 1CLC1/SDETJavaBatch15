package class11.Project;

public class Task4 {
    public static void main(String[] args) {

        /*4) Create a 2D array or integer type where you will store odd and even numbers.
         Develop a program which will identify/print the even numbers only.*/

        int [][] arr={{7,22,43,59},
                {10,20,172,354},
                {66,77,308,876}
        };
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    System.out.println(anInt);
                }
            }

        }
    }
}
