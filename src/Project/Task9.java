package Project;

public class Task9 {
    public static void main(String[] args) {

        /*9)Maximum and minimum number in the array?*/

        int [] numbers={7,26,37,67,180};

        int max=numbers[0];
        int min=numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min)
            {min=numbers[i];
            }
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}

