package class27;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {

        // we have created an array of Strings
        // <> they are diamond operators or angle brackets we specify the data type in them
        ArrayList<String> names=new ArrayList<>();
        // add method to add elements to this arraylist
        names.add("Pete");
        names.add("Steve");
        names.add("John");
        names.add("Jim");
        names.add("Ben");
        names.add("George");

        System.out.println(names);
    }
}
