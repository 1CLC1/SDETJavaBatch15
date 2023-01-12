package class4;

public class Task4 {
    public static void main(String[] args) {
        /*
        You are DMV representative, you need to ask the customer what their age is.
        If they are 18 and older you will issue a driver license to them,
        otherwise you will offer them to get a learners permit.
         */

        int age = 17;
        if (age >= 18){
            System.out.println("You qualify to get your driver's license");
        }else{
            System.out.println("Unfortunately, you are under age. You can only get your learner's permit");
        }
    }
}
