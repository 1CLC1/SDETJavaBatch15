package class11;

public class Example1 {
    public static void main(String[] args) {

        int num1=10;
        int num2=20;
        // 0 1 1 2 3 5 8
        // 5 11 13


        int [][] matrix={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}

        };
        // write a loop to print all the elements from this 2D array
        // matrix.length tells us how many 1D arrays are present in this 2D array
        for (int[] arr : matrix) {

            // matrix[i].length the size of each 1D array

            for (int number : arr) {
                if (number % 2 != 0) {
                    System.out.print(number + " ");
                }

            }
            System.out.println();
        }
    }
}
