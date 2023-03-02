package class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetsDemo1 {
    public static void main(String[] args) {

        // HashSet does not allow duplicate values and it does not maintain insertion order
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Java");
        fruit.add("Tea");
        fruit.add("Coke");
        fruit.add("Pepsi");
        fruit.add("Milk");
        System.out.println(fruit);


    }
}
