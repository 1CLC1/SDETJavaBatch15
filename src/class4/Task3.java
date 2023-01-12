package class4;

public class Task3 {
    public static void main(String[] args) {
        /*
        You are a loan specialist, you need to ask user what loan amount is needed.
        If loan is less or equal to 200,000 then you would lend the money otherwise you
        would reject the client.
         */

        int loanAmount=150000;

        if(loanAmount <= 200000) {
            System.out.println("I will lend you the money");
        }else{
            System.out.println("I will not lend you the money");
        }

    }
}
