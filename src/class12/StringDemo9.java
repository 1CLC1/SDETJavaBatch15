package class12;

public class StringDemo9 {

    public static void main(String[] args) {

        String str="hbjhbnn 58649657668654 ^^%&&**";
        int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("Total isAlphabetic in str is "+counter);
    }
}
