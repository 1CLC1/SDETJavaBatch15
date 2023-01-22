package Project;

public class Task7 {
    public static void main(String[] args) {

        /*7)Write a java program to check whether a given number is prime or not?*/

        int num = 17;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
