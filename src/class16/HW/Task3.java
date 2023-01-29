package class16.HW;

public class Task3 {
   /*
   Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
    */

    private String str(String vowel){
        String newStr=vowel.replaceAll("[^AEIOUaeiou]","");
        return newStr;
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        System.out.println(task3.str("This is a sentence with only vowels"));
    }
}




