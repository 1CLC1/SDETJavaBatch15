package class16.HW;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
    */

    public String reverseStr(String input){
        String newStr="";
        for (int i =input.length()-1; i>=0 ; i--) {
            newStr+=input.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        Task2 task1=new Task2();
        System.out.println(task1.reverseStr("This sentence is in reverse"));
    }
}
