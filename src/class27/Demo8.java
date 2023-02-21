package class27;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        // add method to add elements to this arraylist
        names.add("Pete");
        names.add("Steve");
        names.add("John");
        names.add("Jim");
        names.add("Ben");
        names.add("George");
        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
