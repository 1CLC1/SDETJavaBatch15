package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 45, 50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i]; // adding all the numbers
        }
        System.out.println(sum);


    }
}
