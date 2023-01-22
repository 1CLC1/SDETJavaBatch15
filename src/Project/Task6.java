package Project;

public class Task6 {
    public static void main(String[] args) {

        /*6)Write a program to swap 2 numbers without a temporary variable?*/

        int [] arr={20, 16, 3, 42, 79, 32};


        for (int i=0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                arr[i]=1111;
            }
        }

        System.out.println("The array after replacing all odd numbers with 1111");
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
